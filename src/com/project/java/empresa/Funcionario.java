package com.project.java.empresa;

public class Funcionario extends Humano{
	private String numeroId;
	private Projeto projeto;
	
	
	//LOGIN 
	//CONSULTAR PROJETO
	
	
	public Funcionario () {
	}
	
	public Funcionario (String nome, int idade, String numeroId) {
		super(nome, idade);
		this.numeroId = numeroId;
	}
	
	public Funcionario (String nome, int idade, String numeroId, Projeto projeto) {
		super(nome, idade);
		this.numeroId = numeroId;
		this.projeto = projeto;
	}
	
	
	public String getNumeroId() {
		return numeroId;
	}
	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}


	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	

	
}
