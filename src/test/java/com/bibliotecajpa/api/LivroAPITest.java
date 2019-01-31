package com.bibliotecajpa.api;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.bibliotecajpa.dto.LivroDTO;
import com.bibliotecajpa.service.LivroService;

@RunWith(SpringRunner.class)
@WebMvcTest(LivroAPI.class)
@ActiveProfiles("test")
public class LivroAPITest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private LivroService livroService;

	@Test
	public void test1() throws Exception {
		when(livroService.buscarTodosLivros()).thenReturn(new ArrayList<LivroDTO>());
		mockMvc.perform(get("/livros")).andExpect(status().isOk());
		
		verify(livroService).buscarTodosLivros();
	}
	
}
