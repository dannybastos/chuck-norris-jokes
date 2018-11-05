package br.com.spring5.chucknorrisjokes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MapJokesService implements JokesService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	private List<String> jokes;
	
	public MapJokesService() {
		super();
		jokes = new ArrayList<>();
		jokes.add("Chuck Norris sold his soul to the devil for his rugged good looks and unparalleled martial arts ability. "
				+ "Shortly after the transaction was finalized, "
				+ "Chuck roundhouse kicked the devil in the face and took his soul back. "
				+ "The devil, who appreciates irony, couldn't stay mad and admitted he should have seen it coming. "
				+ "They now play poker the second Wednesday of every month.");
		jokes.add("Chuck Norris has already been to Mars; that's why there are no signs of life there.");
		jokes.add("They once made a \"Chuck Norris\" brand toilet paper, but it wouldn't take shit from anybody.");
	}

	@Override
	public String getRandomJoke() {
		Integer i = ThreadLocalRandom.current().nextInt(1,jokes.size());
		String result = jokes.get(i);
		logger.info(String.format("Joke : %s", result));
		return result;
	}

}
