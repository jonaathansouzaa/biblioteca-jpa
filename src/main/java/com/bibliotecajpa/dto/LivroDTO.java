package com.bibliotecajpa.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LivroDTO {

	@NotNull
	@NotEmpty
	private String nome;
	private String descricao;
	private String autor;
	private String editora;

	public LivroDTO() {

	}
	
	public LivroDTO(String nome) {
		this.nome = nome;
	}
	
	public LivroDTO(String nome, String descricao, String autor, String editora) {
		this.nome = nome;
		this.descricao = descricao;
		this.autor = autor;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String author) {
		this.autor = author;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
