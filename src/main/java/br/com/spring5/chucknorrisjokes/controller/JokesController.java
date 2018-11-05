package br.com.spring5.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring5.chucknorrisjokes.service.JokesService;

@Controller
public class JokesController {
	private JokesService jokesService;
	
	public JokesController(JokesService jokesService) {
		super();
		this.jokesService = jokesService;
	}


	@GetMapping("/")
	public ModelAndView getJokes() {
		String result = jokesService.getRandomJoke();
		
		ModelAndView modelAndView = new ModelAndView("chuck-norris-jokes");
		modelAndView.addObject("joke", result);
		return modelAndView;
	}
	
}
