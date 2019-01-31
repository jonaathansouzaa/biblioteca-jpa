package com.bibliotecajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bibliotecajpa.model.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long>{

}
