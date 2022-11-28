package com.project.java.empresa;

public class Chefe extends Humano {
	
	private Empresa empresa;
	private final String login = "admin";
	private final String password = "admin123";
	
	//CADASTRAR NOVO FUNCIONÁRIO
   //DELETAR FUNCIONÁRIO
  //CADASTRAR PROJETO PARA FUNCIONÁRIO X
	
	public Chefe () {
	}
	
	public Chefe (String nome, int idade, Empresa empresa) {
		super(nome, idade);
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}
	
}
