package br.com.principal.webTestes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.principal.webTestes.model.entities.Usuario;
import br.com.principal.webTestes.model.repositories.UsuarioRepository;

@Controller
@RequestMapping(path = "/api")
public class UsuarioController {

	@Autowired(required = true)
	private UsuarioRepository repositoryUsuario;
	private Usuario user;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/paginaInicial")
	public String paginaInicial(@RequestParam(name = "usuario") String nome,@RequestParam(name = "senha") String senha) {
		
		try {
			nome = nome.toLowerCase();
			user = repositoryUsuario.findByNome(nome);
			
			if (nome.equals(user.getNome()) && senha.equals(user.getSenha())){
				return "teste/sucesso";
			} else if (nome.equals(user.getNome()) && senha.equals(user.getSenha()) == false) {
				return "teste/falha";
			}
		} catch (Exception e) {
			return "teste/falha";
		}
		
		return null;
		
	}

	@RequestMapping("/registrar")
	public String registrar() {
		return "registrar";
	}
	@RequestMapping(method = RequestMethod.POST, path = "/registrar/salvar")
	public String teste(@RequestParam(name = "usuario") String nome,@RequestParam(name = "senha") String senha) {
		repositoryUsuario.save(new Usuario(nome, senha));
		return "/api/login";
	}
	
}
