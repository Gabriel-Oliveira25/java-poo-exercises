package com.project.java.empresa;

public class Humano {
	private String nome;
	private int idade;
	
	// HUMANO -> CHEFE 
   // HUMANO -> FUNCIONÁRIO
	
	public Humano () {
	}
	
	public Humano(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
