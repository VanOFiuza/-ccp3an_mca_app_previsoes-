package br.usjt.PrevisaoTempo;

import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.PrevisaoTempo.model.Cidade;
import br.usjt.PrevisaoTempo.respository.CidadeRepository;

public class CidadeTest {
	
	@Autowired
	private CidadeRepository cidadeRepository;

	@Test
	public void testBuscaPorLongitude() {
	Optional<Cidade> a = cidadeRepository.findById(2L);
	System.out.println(a.get());
	}

}
