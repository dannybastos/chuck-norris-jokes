package br.com.spring5.chucknorrisjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring5.chucknorrisjokes.service.JokesService;

@Controller
public class JokesController {
	private static final String CHUCK_NORRIS_JOKES_VIEW = "chuck-norris-jokes";
	private JokesService jokesService;
	
	@Autowired
	public JokesController(JokesService jokesService) {
		super();
		this.jokesService = jokesService;
	}


	@GetMapping("/")
	public String getJokes(Model model) {
		String result = jokesService.getRandomJoke();
		model.addAttribute("joke", result);
		return CHUCK_NORRIS_JOKES_VIEW;
	}
	
	@GetMapping("/v2")
	public ModelAndView getJokes1() {
		String result = jokesService.getRandomJoke();
		ModelAndView model = new ModelAndView(CHUCK_NORRIS_JOKES_VIEW);
		model.addObject("joke", result);
		return model;
	}
}
