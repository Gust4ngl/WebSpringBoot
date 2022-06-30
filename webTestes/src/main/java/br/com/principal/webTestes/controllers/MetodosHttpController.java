package br.com.principal.webTestes.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index.html/metodos")
public class MetodosHttpController {

	@GetMapping("getTeste")
	public String get() {
		return "Requisição GET";
	}
	@GetMapping("/teste")
	public String xablau() {
		return "Requisição Incrível";
	}

	@PostMapping
	public String post() {
		return "Requisição POST";
	}

	@PutMapping
	public String put() {
		return "Requisição PUT";
	}

	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}

	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";
	}

}
