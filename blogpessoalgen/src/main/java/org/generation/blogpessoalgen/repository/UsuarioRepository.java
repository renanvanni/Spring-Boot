package org.generation.blogpessoalgen.repository;

import java.util.Optional;

import org.generation.blogpessoalgen.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	
}
