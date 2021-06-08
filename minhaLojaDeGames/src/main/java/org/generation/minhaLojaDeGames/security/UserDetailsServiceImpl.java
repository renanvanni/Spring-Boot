package org.generation.minhaLojaDeGames.security;

import java.util.Optional;

import org.generation.minhaLojaDeGames.model.Usuario;
import org.generation.minhaLojaDeGames.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> user = repository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "Not Found."));
		return user.map(UserDetailsImpl::new).get();
	}

}
