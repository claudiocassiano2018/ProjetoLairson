package com.projeto.eteClaudio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.eteClaudio.domain.Usuario;
import com.projeto.eteClaudio.repositiries.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository user;
	
	public Usuario buscar(Integer id) {
		Optional<Usuario> obj = user.findById(id);
		return obj.orElse(null);
	}

	
}
