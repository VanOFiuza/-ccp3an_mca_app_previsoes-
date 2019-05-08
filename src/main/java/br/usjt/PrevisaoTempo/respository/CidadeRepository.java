package br.usjt.PrevisaoTempo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.usjt.PrevisaoTempo.model.Cidade;



public interface CidadeRepository extends JpaRepository<Cidade, Long> {

//	public Cidade queryByLongitude_latitude (String latitude,String longitude);
//	public Cidade queryByNome (String nome);
	
//	
//	
	@Query ("SELECT c FROM Cidade c WHERE longitude = :longi AND latitude= :lat")
	public Cidade buscarlatitude_longitude  (@Param ("longi") String longi ,
			 @Param ("lat") String lat);
//	
//	@Query ("SELECT c FROM cidade c WHERE c.nome :nome")
//	public Cidade buscarCidadebyNome (@Param ("nome") String nome);
	
	@Query ("SELECT c FROM Cidade c WHERE nome LIKE :letra%")
	public List <Cidade> buscarPorLetraInicialDoNome (@Param ("letra") String letra);
	
	

}
