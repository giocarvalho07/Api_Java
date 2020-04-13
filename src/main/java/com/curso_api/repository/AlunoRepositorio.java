package com.curso_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso_api.entities.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Integer> {

	
}
