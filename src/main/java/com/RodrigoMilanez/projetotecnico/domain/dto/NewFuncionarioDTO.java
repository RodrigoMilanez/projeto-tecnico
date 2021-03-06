package com.RodrigoMilanez.projetotecnico.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.RodrigoMilanez.projetotecnico.domain.enums.Perfil;
import com.sun.istack.NotNull;

public class NewFuncionarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	@NotEmpty(message="Este campo deve ser preenchido")
	@Length(min=5, max=80, message="O tamanho deve ter de 5 a 80 caracteres")
	private String nome;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "Email inválido")
	private String email;

	@NotEmpty(message = "Preenchimento obrigatório")
	private String senha;
	
	
	@NotNull
	private Perfil Perfil;
	
	@NotEmpty(message="Este campo deve ser preenchido")
	private String telefone;
		
	public NewFuncionarioDTO() {
		
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

	public Perfil getPerfil() {
		return Perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.Perfil = perfil;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
		
 }
