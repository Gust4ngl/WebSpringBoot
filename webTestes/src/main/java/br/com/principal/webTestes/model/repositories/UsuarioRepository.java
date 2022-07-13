package br.com.principal.webTestes.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.principal.webTestes.model.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	Usuario findByNome(String nome);
	
}
