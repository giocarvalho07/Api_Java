package com.curso_api.services;

import java.util.List;

import com.curso_api.entities.Curso;

public interface CursoService {

		public List<Curso> getCursos();

		public Curso save(Curso curso);
		
		
}
