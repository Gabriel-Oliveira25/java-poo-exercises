package com.project.java.veterinario;

public class Animal {

	private String nome;
	private String tipoAnimal;
	private String raca;
	private int idade;
	
	public Animal() {
		
	}
	
	public Animal(String nome, String tipoAnimal,String raca, int idade) {
		this.nome = nome;
		this.tipoAnimal = tipoAnimal;
		this.raca = raca;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
}
