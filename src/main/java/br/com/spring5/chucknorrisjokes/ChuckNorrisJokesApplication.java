package br.com.spring5.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesApplication.class, args);
	}

	@GetMapping("/")
	public String getJokes() {
		return "chuck-norris-jokes";
	}
}
