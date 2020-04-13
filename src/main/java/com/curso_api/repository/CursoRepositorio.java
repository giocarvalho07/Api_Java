package com.curso_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.curso_api.entities.Curso;


public interface CursoRepositorio extends JpaRepository<Curso, Integer> {

}


