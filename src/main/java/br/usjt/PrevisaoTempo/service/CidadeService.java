package br.usjt.PrevisaoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.PrevisaoTempo.model.Cidade;
import br.usjt.PrevisaoTempo.respository.CidadeRepository;


public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public void salvar(Cidade cidade) {
		repo.save(cidade);
	}
	
	public List<Cidade> listarCidade() {
		return repo.findAll();
	}
	
	public void excluir(Cidade cidade) {
		repo.delete(cidade);
	}
}