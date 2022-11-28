package com.project.java.empresa;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AcoesGerais {
	
	static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	public static void menu() {
		int escolha;
		System.out.println("BEM VINDO");
		
		while (true) {
			
			System.out.println("( 0 ) FECHAR");
			System.out.println("( 1 ) LOGIN CHEFE");
			System.out.println("( 2 ) LOGIN FUNCIONARIO");
			System.out.print("ESCOLHA: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				menuChefe();
				break;
			case 2:
				menuFuncionario();
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
			if (escolha == 0) {
				break;
			}
		}
	}
	
	
	public static void menuChefe() {
		int escolha;
		
		while(true) {
			System.out.println("( 0 ) VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("( 1 ) CADASTRAR NOVO FUNCIONARIO");
			System.out.println("( 2 ) DELETAR FUNCIONARIO");
			System.out.println("( 3 ) CADASTRAR NOVO PROJETO");
			System.out.print("ESCOLHA: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				cadastrarNovoFuncionario();
				break;
			case 2: 
				deletarFuncionario();
				break;
			case 3:
				cadastrarProjetoParaFuncionario();
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
				}
			if (escolha == 0) {
				break;
			}	
		}	
	}
	
	public static void cadastrarNovoFuncionario() {
		System.out.print("NOME DO NOVO FUNCIONARIO: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("IDADE DO NOVO FUNCIONARIO: ");
		int idade = sc.nextInt();

		System.out.print("DIGITE UM NÚMERO DE ID PARA CADASTRO: ");
		sc.nextLine();
		String numeroId = sc.nextLine();
		
		funcionarios.add(new Funcionario(nome, idade, "BR" + numeroId + nome));
		
	
	}
	
	
	public static void deletarFuncionario() {
		for (int x = 0; x < funcionarios.size(); x++) {
			System.out.println(x +"  -  " + funcionarios.get(x).getNome() + " " + funcionarios.get(x).getNumeroId());
		}
		
		System.out.print("DIGITE O NUMERO DO INDEX PARA DELETAR O FUNC: ");
		int func = sc.nextInt();
		
		
		
		try {
			funcionarios.remove(func);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERROR! FUNCIONARIO INEXISTENTE");
		}
	
		
	}
	
	public static void cadastrarProjetoParaFuncionario() {
		for (int x = 0; x < funcionarios.size(); x++) {
			System.out.println(x +"  -  " + funcionarios.get(x).getNome() + " " + funcionarios.get(x).getNumeroId());
		}
		
		
		System.out.print("SELECIONE O FUNCIONÁRIO: ");
		int func = sc.nextInt();
		sc.nextLine();
		System.out.print("DÊ UM NOME AO PROJETO: ");
		String projeto = sc.nextLine();
	
		System.out.print("INDIQUE O PRAZO DO PROJETO: ");
		String prazoProjeto = sc.nextLine();
	
		System.out.print("DESCRIÇÃO DO QUE DEVE SER FEITO: ");		
		String descProjeto = sc.nextLine();

		funcionarios.get(func).setProjeto(new Projeto(projeto, prazoProjeto, descProjeto));;
				
		System.out.println("NOME DO PROJETO: " + funcionarios.get(func).getProjeto().getProjeto() + 
							" / TEMPO DE ENTREGA: " + funcionarios.get(func).getProjeto().getPrazoProjeto() +
							"/ DESCRIÇÃO DO PROJETO: " + funcionarios.get(func).getProjeto().getDescProjeto());
	}
	
	
	public static void menuFuncionario() {
		System.out.println("MENU FUNCIONARIO");
		int index = -1;
		sc.nextLine();
		System.out.println("LOGIN: ");
		String login = sc.nextLine();
		System.out.println("ID FUNCIONARIO: ");
		String idFunc = sc.nextLine();
		
		for (int x = 0; x < funcionarios.size(); x++) {
			if (login.equals(funcionarios.get(x).getNome()) & idFunc.equals(funcionarios.get(x).getNumeroId())) {
				index = x;
			}
		} 
		
		if (index == -1) {
			System.out.println("FUNCIONARIO NÃO ENCONTRADO");
		} else {
			System.out.println("NOME: " + funcionarios.get(index).getNome());
			System.out.println("IDADE: " + funcionarios.get(index).getIdade());
			System.out.println("NUMERO DO ID: " + funcionarios.get(index).getNumeroId());
			System.out.println("NOME DO ATUAL PROJETO DESIGNADO: " + funcionarios.get(index).getProjeto().getProjeto());
			System.out.println("PRAZO DE ENTREGA: " + funcionarios.get(index).getProjeto().getPrazoProjeto());
			System.out.println("DESCRIÇÃO DO PROJETO: " + funcionarios.get(index).getProjeto().getDescProjeto());
		}
	}
}
