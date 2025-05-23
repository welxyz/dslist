package com.devsuperior.spring_intensivao.services;

import com.devsuperior.spring_intensivao.entities.Livro;
import com.devsuperior.spring_intensivao.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private LivroRepository repository;

    public List<Livro> findAll(){
        List<Livro> livros = repository.findAll();
        return livros;
    }

}
