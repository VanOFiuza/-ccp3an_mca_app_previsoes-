package br.usjt.PrevisaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisaoTempo.model.Periodo;
import br.usjt.PrevisaoTempo.respository.PeriodoRepository;

@Service
public class PeriodosService {
	@Autowired
	private PeriodoRepository periodoRepo;

	public List <Periodo> listarTodos (){
	return periodoRepo.findAll();
	}
}
