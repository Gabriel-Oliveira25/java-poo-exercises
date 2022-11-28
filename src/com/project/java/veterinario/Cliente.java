package com.project.java.veterinario;

import java.util.ArrayList;

public class Cliente extends Humano{
	
	
	
	private String senha;
	private String idCliente;
	private ArrayList<Animal> animais;
	
	
	//CADASTRO CLIENTE E CADASTRO DE X ANIMAIS
	//CADASTRO NOVA CONSULTA COM VETERINARIO
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idade, String senha, String idCliente) {
		super(nome, idade); 
		this.senha = senha;
		this.idCliente = idCliente;
	}
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
