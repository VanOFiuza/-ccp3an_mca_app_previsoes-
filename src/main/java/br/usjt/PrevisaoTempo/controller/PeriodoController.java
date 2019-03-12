package br.usjt.PrevisaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoTempo.model.Periodo;
import br.usjt.PrevisaoTempo.respository.PeriodoRepository;

@Controller
public class PeriodoController {

	@Autowired
	private PeriodoRepository periodoRepo;

	@GetMapping("/previsao")
	public ModelAndView listarPeriodos() {

		ModelAndView mv = new ModelAndView("lista_previsao");

		List<Periodo> periodos = periodoRepo.findAll();

		mv.addObject("periodos", periodos);
		return mv;
	}

}
