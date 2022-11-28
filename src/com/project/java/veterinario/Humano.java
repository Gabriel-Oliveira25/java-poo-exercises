package com.project.java.veterinario;

public class Humano {
	
	private String nome;
	private int idade;
	
	public Humano() {
		
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
