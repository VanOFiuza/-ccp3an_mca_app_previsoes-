package br.usjt.PrevisaoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoTempo.model.Periodo;
import br.usjt.PrevisaoTempo.service.PeriodosService;

@Controller
public class PeriodoController {

	// não faça mais essa injeção
	// @Autowired
	// private AlunosRepository alunosRepo;
	// injete um serviço

	@Autowired
	private PeriodosService periodosService;

	@GetMapping("/previsao")
	public ModelAndView listarPeriodos() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsao");
		// para modelar o formulário
		mv.addObject(new Periodo());
		// Busque a coleção com o service
		List<Periodo> periodos = periodosService.listarTodos();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("periodos", periodos);
		// devolva o ModelAndView
		return mv;
	}

	@PostMapping("/previsao")
	public String salvar(Periodo periodo) {
		// salvando com o service
		periodosService.salvar(periodo);
		return "redirect:/previsao";
	}

}
