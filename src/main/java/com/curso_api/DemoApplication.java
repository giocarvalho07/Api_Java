package com.curso_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso_api.entities.Curso;
import com.curso_api.repository.CursoRepositorio;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private CursoRepositorio cursoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Curso curso1 = new Curso("graduação em TI", "Tecnologia");
		Curso curso2 = new Curso("graduação em ADS", "Tecnologia");
		Curso curso3 = new Curso("graduacao em ED. Fisica", "Saúde");
		Curso curso4 = new Curso("graduacao em Direito", "Negócios");
		Curso curso5 = new Curso("graduacao em Pedagogia", "Educação");
		Curso curso6 = new Curso("graduacao em Nutrição", "Saúde");

		
		cursoRepositorio.save(curso1);
		cursoRepositorio.save(curso2);
		cursoRepositorio.save(curso3);
		cursoRepositorio.save(curso4);
		cursoRepositorio.save(curso5);
		cursoRepositorio.save(curso6);
		
	}

}
