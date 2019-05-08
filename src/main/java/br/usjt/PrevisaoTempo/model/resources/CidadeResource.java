package br.usjt.PrevisaoTempo.model.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.PrevisaoTempo.model.Cidade;
import br.usjt.PrevisaoTempo.respository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRepo;

	@GetMapping("/lista")
	public List<Cidade> todasCidade() {
		return cidadeRepo.findAll();
	}

	@PostMapping("/salvar")
	public void salvar(@RequestBody Cidade cidade) {
		cidadeRepo.save(cidade);
	}

	@GetMapping("/buscarPorLetra/{letra}")
	public List<Cidade> buscarLetraNome(@PathVariable String letra) {
		return cidadeRepo.buscarPorLetraInicialDoNome(letra);
	}
	@GetMapping("/buscarPorLatitudeLogitude/{latitude},{longitude}")
	public Cidade buscarPorLatitudeLogitude(@PathVariable("latitude") String lat, @PathVariable("longitude") String longi) {
		return cidadeRepo.buscarlatitude_longitude(longi, lat);
	}

}
