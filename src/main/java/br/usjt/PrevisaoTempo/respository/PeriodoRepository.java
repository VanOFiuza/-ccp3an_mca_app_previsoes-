package br.usjt.PrevisaoTempo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.model.Periodo;


public interface PeriodoRepository extends JpaRepository<Periodo, Long>{
	
	

}
