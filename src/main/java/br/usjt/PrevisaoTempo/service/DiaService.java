package br.usjt.PrevisaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.PrevisaoTempo.model.Dia;
import br.usjt.PrevisaoTempo.respository.DiaRepository;
 
public class DiaService {
	
	@Autowired
	private DiaRepository repo;
	
	public void salvar(Dia dia) {
		repo.save(dia);
	}
	
	public List<Dia> listarDias() {
		return repo.findAll();
	}
	
	public void excluir(Dia dia) {
		repo.delete(dia);
	}
}