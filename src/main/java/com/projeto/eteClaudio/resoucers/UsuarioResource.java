package com.projeto.eteClaudio.resoucers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.eteClaudio.domain.Usuario;
import com.projeto.eteClaudio.services.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Usuario obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		/*
		Usuario usuario1 = new Usuario(1,"Claudio","claudiocassiano@gmail.com",12345);
		Usuario usuario2 = new Usuario(2,"Laura","laura@gmail.com",43456);
		Usuario usuario3 = new Usuario(3,"Amanda","amanda@gmail.com",54321);
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(usuario1);
		lista.add(usuario2);
		
		return lista;
		*/
	}
	

}
