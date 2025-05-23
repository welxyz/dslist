package com.devsuperior.spring_intensivao.services;

import com.devsuperior.spring_intensivao.dto.LivroMinDTO;
import com.devsuperior.spring_intensivao.entities.Livro;
import com.devsuperior.spring_intensivao.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public List<LivroMinDTO> findAll(){
        List<Livro> livros = repository.findAll();

        List<LivroMinDTO> livrosDTO = livros
                .stream()
                .map(x -> new LivroMinDTO(
                        x.getId(),
                        x.getTitle(),
                        x.getAuthor(),
                        x.getYear(),
                        x.getImgUrl(),
                        x.getShortDescription()
                )).toList();


        return livrosDTO;
    }

}
