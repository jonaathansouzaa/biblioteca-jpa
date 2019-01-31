package com.bibliotecajpa.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotecajpa.dto.LivroDTO;
import com.bibliotecajpa.factory.LivroFactory;
import com.bibliotecajpa.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroFactory livroFactory;
	
	@Autowired
	private LivroRepository livroReposity;
	
	public List<LivroDTO> buscarTodosLivros() {
		return StreamSupport.stream(livroReposity.findAll().spliterator(), false).map(livroFactory::getInstance).collect(Collectors.toList());
	}

	public LivroDTO insereLivro(LivroDTO livroDTO) {
		return livroFactory.getInstance(livroReposity.save(livroFactory.getInstance(livroDTO)));
	}

}
