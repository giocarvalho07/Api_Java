package com.curso_api.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestResource {

	@GetMapping(value = "/oi")
	public String getOi() {
		return "olá galera ! ";
	}
	
	
	@GetMapping("/ola")
	public String getOla() {
		return "olá turma ! ";
	}
}
