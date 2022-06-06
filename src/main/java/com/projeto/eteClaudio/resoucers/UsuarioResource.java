package com.projeto.eteClaudio.resoucers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Está funcionando.";
	}
	

}
