package com.project.java.veterinario;

public class Veterinario extends Humano{
	
	private String crmv;
	
	//FUNÇÃO ATENDER PETS
	
	public Veterinario() {
		
	}
	
	public Veterinario(String nome, int idade, String crmv) {
		super(nome, idade);
		this.crmv = crmv;
	}
	
	
	public String getCrmv() {
		return crmv;
	}
	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}


}
