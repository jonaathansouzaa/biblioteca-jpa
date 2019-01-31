package com.bibliotecajpa.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bibliotecajpa.dto.LivroDTO;
import com.bibliotecajpa.factory.LivroFactory;
import com.bibliotecajpa.model.Livro;
import com.bibliotecajpa.repository.LivroRepository;

@RunWith(MockitoJUnitRunner.class)
public class LivroServiceTest {

	@Mock
	private LivroRepository livroRepository;
	
	@Mock
	private LivroFactory livroFactory;
	
	@InjectMocks
	private LivroService livroService;
	
	@Test
	public void test1() {
		Livro livro = new Livro("Senhor dos aneis - Triologia");
		LivroDTO livroDTO = new LivroDTO("Senhor dos aneis - Triologia");
		when(livroFactory.getInstance(livro)).thenReturn(livroDTO);
		when(livroRepository.findAll()).thenReturn(Arrays.asList(livro));
		List<LivroDTO> livros = livroService.buscarTodosLivros();
		assertEquals(Arrays.asList(livroDTO), livros);
	}
	
}
