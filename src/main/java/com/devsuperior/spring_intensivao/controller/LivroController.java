package com.devsuperior.spring_intensivao.controller;

import com.devsuperior.spring_intensivao.dto.LivroMinDTO;
import com.devsuperior.spring_intensivao.entities.Livro;
import com.devsuperior.spring_intensivao.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping
    public List<LivroMinDTO> findAll(){
        List<LivroMinDTO> livros = service.findAll();
        return livros;
    }

}
