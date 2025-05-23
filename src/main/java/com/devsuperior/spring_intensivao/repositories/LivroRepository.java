package com.devsuperior.spring_intensivao.repositories;

import com.devsuperior.spring_intensivao.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
