package br.usjt.PrevisaoTempo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.PrevisaoTempo.model.Dia;



@Repository
public interface DiaRepository extends JpaRepository<Dia, Long> {

}
