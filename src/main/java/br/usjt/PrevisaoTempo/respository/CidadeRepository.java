package br.usjt.PrevisaoTempo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.model.Cidade;



public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
