package com.project.java.empresa;

public class Projeto {
	private String projeto;
	private String prazoProjeto;
	private String descProjeto;
	
	
	public Projeto() {
		
	}
	
	public Projeto(String projeto, String prazoProjeto, String descProjeto) {
		this.projeto = projeto;
		this.prazoProjeto = prazoProjeto;
		this.descProjeto = descProjeto;
	}
	
	
	
	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getPrazoProjeto() {
		return prazoProjeto;
	}

	public void setPrazoProjeto(String prazoProjeto) {
		this.prazoProjeto = prazoProjeto;
	}
	
	public String getDescProjeto() {
		return descProjeto;
	}

	public void setDescProjeto(String descProjeto) {
		this.descProjeto = descProjeto;
	}


	
	
}
