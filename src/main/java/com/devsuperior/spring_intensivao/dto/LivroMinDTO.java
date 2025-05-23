package com.devsuperior.spring_intensivao.dto;

public record LivroMinDTO (
         Long id,
         String title,
         String author,
         Integer year,
         String imgUrl,
         String shortDescription
){ }
