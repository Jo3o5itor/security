package com.Bcript.safety.dto;

import com.Bcript.safety.entities.Usuario;

public class UsuarioDTO {

	
	private Long id;
	private String email;
	private String senha;
	
	public UsuarioDTO() {
		
	}

	public UsuarioDTO(Long id, String email, String senha) {
		this.id = id;
		this.email = email;
		this.senha = senha;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		email = entity.getEmail();
		senha = entity.getSenha();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
