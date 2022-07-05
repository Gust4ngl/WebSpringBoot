package br.com.principal.webTestes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/api")
public class UsuarioController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/logar")
	public String logar(@RequestParam(name = "usuario") String usuario,@RequestParam(name = "senha") String senha) {
		if(usuario.equals("g") && senha.equals("1")) {
			return "teste/sucesso";
		} else {
			return "teste/falha";
		}
	}
	
}
