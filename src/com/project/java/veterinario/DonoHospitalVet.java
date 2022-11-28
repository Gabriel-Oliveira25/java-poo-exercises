package com.project.java.veterinario;

public class DonoHospitalVet extends Humano{
	
	//CADASTRAR VETERINARIOS
	//EXCLUIR VETERINARIOS
	//LISTAR CLIENTES CADASTRADOS
	
	private final String login = "admin";
	private final String senha = "admin123";
	
	public DonoHospitalVet() {
		
	}
	
	public DonoHospitalVet(String nome, int idade) {
		super(nome, idade);
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}
}
