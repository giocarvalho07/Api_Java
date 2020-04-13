package com.curso_api.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso_api.entities.Curso;
import com.curso_api.services.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping
	public ResponseEntity<List<Curso>> getCurso() {
		
		List<Curso> listaCursos = cursoService.getCursos(); 
		
		return ResponseEntity.ok().body(listaCursos); 
	}
	
	@PostMapping("/criar")
	public ResponseEntity<Curso> criarCurso(@RequestBody Curso curso) throws URISyntaxException{
		Curso novoCurso = cursoService.save(curso);
		return ResponseEntity.created(new URI ("/cursos/criar/" + novoCurso.getId())).body(novoCurso);
	}
	
}
