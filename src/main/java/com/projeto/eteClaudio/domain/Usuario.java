package com.projeto.eteClaudio.domain;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String email;
	private Integer numeros;
	
	public Usuario() {
		
	}

	public Usuario(Integer id, String nome, String email, Integer numeros) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.numeros = numeros;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumeros() {
		return numeros;
	}

	public void setNumeros(Integer numeros) {
		this.numeros = numeros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

	
	
	

}
