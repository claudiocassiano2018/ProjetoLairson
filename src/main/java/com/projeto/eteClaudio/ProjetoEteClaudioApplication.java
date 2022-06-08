package com.projeto.eteClaudio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.eteClaudio.domain.Usuario;
import com.projeto.eteClaudio.repositiries.UsuarioRepository;

@SpringBootApplication
public class ProjetoEteClaudioApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEteClaudioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuario4 = new Usuario(null, "Afonso@gmail.com","Afonso", 25894);
		Usuario usuario5 = new Usuario(null, "Eduardo@gmail.com","Eduardo", 58515);
		
		usuarioRepository.saveAll(Arrays.asList(usuario4, usuario5));
		
	}
	
	

}
