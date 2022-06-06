package com.projeto.eteClaudio.resoucers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.eteClaudio.domain.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> listar() {
		Usuario usuario1 = new Usuario(1,"Claudio","claudiocassiano@gmail.com",12345);
		Usuario usuario2 = new Usuario(2,"Laura","laura@gmail.com",43456);
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(usuario1);
		lista.add(usuario2);
		
		return lista;
	}
	

}
