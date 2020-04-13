package com.curso_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso_api.entities.Curso;
import com.curso_api.repository.CursoRepositorio;
import com.curso_api.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	
	
	@Autowired
	private CursoRepositorio cursoRepositorio;
	

	@Override
	public List<Curso> getCursos() {
		return cursoRepositorio.findAll();
	}


	@Override
	public Curso save(Curso curso) {
		return cursoRepositorio.save(curso);
	}

		
}
