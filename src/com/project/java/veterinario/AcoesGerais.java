package com.project.java.veterinario;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class AcoesGerais {

static Scanner sc = new Scanner(System.in);
	
	public static ArrayList<Cliente> clientes = new ArrayList<>();
	
	public static ArrayList<Cliente> filaDeConsultas = new ArrayList<>();
	
	public static ArrayList<Veterinario> veterinarios = new ArrayList<>();
	
	public static void menu() {
		int escolha;
		System.out.println("CLINICA VETERINARIA");
		
		while (true) {
			
			System.out.println("0 - SAIR");
			System.out.println("1 - CLIENTE");
			System.out.println("2 - VETERINARIO");
			System.out.println("3 - ADMIN");
			System.out.print("ESCOLHA: ");
			escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				menuCliente();
				break;
			case 2:
				menuVeterinario();
				break;
			case 3:
				menuAdmin();
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
			if (escolha == 0) {
				break;
			}
		}
	}
	
	
	
	public static void menuCliente() {
		System.out.println("MENU CLIENTE");
		
		while (true) {
			System.out.println("0 - VOLTAR AO MENU PRINCIPAL");
			System.out.println("1 - LOGIN");
			System.out.println("2 - CRIAR NOVA CONTA");
			int escolha = sc.nextInt();
			
			switch(escolha) {
			case 0:
				break;
			case 1:
				loginCliente();
				break;
			case 2:
				cadastrarNovoCliente();
				break;
			default:
				System.out.println("ERRO NA ESCOLHA");
			}
			if (escolha == 0 ) {
				break;
			}
		}	
	}
	
	
	public static void cadastrarNovoCliente() {
		sc.nextLine();
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		System.out.println("IDADE: ");
		int idade = sc.nextInt(); 
		sc.nextLine();
		System.out.print("SENHA: ");
		String senha = sc.nextLine();
		
		String idCliente = "VET" + new Random().nextInt(500) + "XD";
		clientes.add(new Cliente(nome, idade, senha, idCliente));
		
	}
	
	public static void loginCliente() {
		
		int cliente = -1;
		
		sc.nextLine();
		System.out.print("LOGIN: ");
		String login = sc.nextLine();
		System.out.print("SENHA: ");
		String senha = sc.nextLine();
		
		for(int x = 0; x < clientes.size(); x++) {
			if (login.equals(clientes.get(x).getNome()) & senha.equals(clientes.get(x).getSenha())){  
				cliente = x;
			}
		} 
		
		if (cliente >= 0) {
			System.out.println("OLÁ" + clientes.get(cliente).getNome());
			while (true) {
				System.out.println("0 - SAIR");
				System.out.println("1 - CADASTRAR NOVO PET");
				System.out.println("2 - NOVA CONSULTA");		
				int escolha = sc.nextInt();
				
				switch(escolha) {
				case 0:
					break;
				case 1:
					cadastrarNovoPet(cliente);
					break;
				case 2:
					cadastrarNovaConsulta(cliente);
					break;
				default:
					System.out.println("ERRO NA ESCOLHA");
					}
				if (escolha == 0) { 
					break;
				}
			}
		} else {
			System.out.println("CLIENTE NÃO ENCONTRADO NO NOSSO BANCO DE DADOS");
		}	
	}
	
	
	
	public static void cadastrarNovoPet(int cliente) {
		System.out.println("CADASTRAR NOVO PET");
		sc.nextLine();
		System.out.print("NOME DO PET: ");
		String nome = sc.nextLine();
		System.out.print("TIPO DO ANIMAL: ");
		String tipoAnimal = sc.nextLine();
		System.out.println("RAÇA DO ANIMAL: ");
		String raça = sc.nextLine();
		System.out.println("IDADE DO ANIMAL: ");
		int idade = sc.nextInt();	
		
		ArrayList<Animal> animal = clientes.get(cliente).getAnimais();	
		
		clientes.get(cliente).getAnimais();
		
		if (animal == null || animal.isEmpty()) {
			animal = new ArrayList<>();
		}
		
		
		animal.add(new Animal(nome, tipoAnimal, raça, idade));
		
		clientes.get(cliente).setAnimais(animal);	
		
		for (int x = 0; x<clientes.size(); x++) {
			System.out.println(clientes.get(cliente).getNome() + " ");
		}
		for (int x = 0; x<clientes.get(cliente).getAnimais().size(); x++) {
			System.out.println(clientes.get(cliente).getAnimais().get(x).getNome() + " " +
					clientes.get(cliente).getAnimais().get(x).getRaca());
			}
		}
		

	public static void cadastrarNovaConsulta(int cliente) {
		System.out.print("CADASTRAR NOVA CONSULTA PARA HOJE ( S / N ): ");
		String escolha = "N";
		
		try {
			sc.nextLine();
			escolha = sc.nextLine();
		} catch (Exception e) {
			System.out.println("ERRO!");
		}
		
		
		if (escolha.equals("s") || escolha.equals("S")) {
			filaDeConsultas.add(clientes.get(cliente));
			System.out.println("CONSULTA CADASTRADA COM SUCESSO");
		} else {
			System.out.println("CADASTRO DE CONSULTA CANCELADO!");
		}
		
	
		
		
		
		
		
	}
	
	public static void menuAdmin() {
		DonoHospitalVet admin = new DonoHospitalVet();
		
		sc.nextLine();
		System.out.println("LOGIN: ");
		String login = sc.nextLine();
		System.out.println("SENHA: ");
		String senha = sc.nextLine();
	
		if (login.equals(admin.getLogin()) & senha.equals(admin.getSenha())) {
			
			while (true) {
				System.out.println("0 - VOLTAR");
				System.out.println("1 - CADASTRAR NOVO VETERINARIO");
				System.out.println("2 - EXCLUIR VETERINARIO CADASTRADO");
				System.out.println("3 - LISTAR CLIENTES CADASTRADOS");
				int escolha = sc.nextInt();
				
				switch(escolha) {
				case 0:
					break;
				case 1:
					cadastrarVeterinario();
					break;
				case 2:
					excluirVeterinario();
					break;
				case 3:
					listarClientesCadastrados();
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA");
				}
				if (escolha == 0){
					break;
				}	
			} 
		} else {
				System.out.println("LOGIN OU SENHA INVÁLIDOS.");	
		}	
	}
	
	

	public static void cadastrarVeterinario() {
		
		System.out.print("NOME DO VETERINARIO: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("IDADE DO VETERINARIO: ");
		int idade = sc.nextInt();

		System.out.print("CRMV: ");
		sc.nextLine();
		String crmv = sc.nextLine();
		
		veterinarios.add(new Veterinario(nome, idade, crmv));
		
	}
	
	public static void excluirVeterinario() {
		for(int x = 0; x<veterinarios.size(); x++) {
			System.out.println(x + " - " + veterinarios.get(x).getNome() + " / " +
								veterinarios.get(x).getCrmv());	
		}
		
		System.out.print("ESCOLHA O INDEX DO VETERINARIO A SER EXCLUÍDO: ");
		int vetDel = sc.nextInt();
		
		try {
			veterinarios.remove(vetDel);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("ERRO!");
		}
	}
	
	public static void listarClientesCadastrados() {
		for (int x = 0; x < clientes.size(); x++) {
			System.out.println("NOME: " + clientes.get(x).getNome());
			System.out.println("IDADE: " + clientes.get(x).getIdade());
			System.out.println("ID CLIENTE: " + clientes.get(x).getIdCliente());
			System.out.println("--------------------------------------------");
			
		}
	}
	
	
	public static void menuVeterinario() {
		
		sc.nextLine();
		System.out.println("NOME: ");
		String nome = sc.nextLine();
		System.out.println("CRMV: ");
		String crmv = sc.nextLine();
		int vet = -1;
		
		for(int x = 0; x<veterinarios.size(); x++) {
			if (nome.equals(veterinarios.get(x).getNome()) & crmv.equals(veterinarios.get(x).getCrmv())) {
				vet = x;
			}
		}
		
		if (vet >= 0) {
			System.out.println("BEM VINDO DR. " + veterinarios.get(vet).getNome());
			
			
			while (true) {
				if (filaDeConsultas.size() >= 1) {
					
					
						System.out.println("FILA DE CONSULTAS: ");
						for(int x = 0; x<filaDeConsultas.size(); x++) {
							System.out.println("CLIENTE: " + filaDeConsultas.get(x).getNome());
							System.out.println("IDCLIENTE: " + filaDeConsultas.get(x).getIdCliente());
							System.out.println("--------------------------------------------");
						}		
						
						System.out.println("0 - DESLOGAR");
						System.out.println("1 - ATENDER O PRÓXIMO DA FILA");
						
						int escolha = sc.nextInt();
						
						if (escolha == 1) {
							System.out.println("ATENDIMENTO ATUAL: " + filaDeConsultas.get(0).getNome());
							filaDeConsultas.remove(0);
							System.out.println("--------------------------------------------");
						
					}
				
			}else {
				System.out.println("SEM CONSULTAS REGISTRADAS PARA HOJE.");
				break;
			}
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}			
	}	
}

