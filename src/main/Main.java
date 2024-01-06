package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pessoa.Cliente;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int opcao = 1;
		//menu inicial
		
		List<Cliente> listaClientes = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
				
		while(opcao != 0) {
			System.out.println("Menu Principal");
			System.out.println("Selecione a opção desejada:");
			System.out.println("Opção 1: Cadastrar cliente");
			System.out.println("Opção 2: Listar clientes");
			System.out.println("Opção 3: Deletar cliente");
			System.out.println("Opção 0: Sair");
			
			opcao = leia.nextInt();	
			
			switch (opcao) {
			case 1: {		
				try {
					String nome = leia.nextLine();
					System.out.println("Cadastro de Cliente:");
					System.out.println("Informe o nome do cliente:");
					nome = leia.nextLine();
					
					System.out.println("Informe o cpf do cliente:");
					String cpf = leia.nextLine();
					
					System.out.println("Informe a idade do cliente:");
					int idade = leia.nextInt();
					
					Cliente c1 = cadastrarCliente(nome, cpf, idade);
					listaClientes.add(c1);
					
					System.out.println("*** Cliente cadastrado ***");
							        
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			case 2: {				
				listarClientes(listaClientes);
				break;
			}
			case 3: {				
				try {
					String nome = leia.nextLine();
					System.out.println("Informe o nome do cliente a ser deletado:");
					nome = leia.nextLine();
					deletarCliente(nome, listaClientes);
					System.out.println("Cliente deletado");
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
		}
								
	}
	
	public static Cliente cadastrarCliente(String nome, String cPF, int idade) {
		try {
			Cliente c;
			c = new Cliente(nome, cPF,idade);
			return c;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu um erro ao cadastrar o cliente");
			
		}
		return null;
		
		
	}
	
	public static void listarClientes(List<Cliente> lista) {
		try {
			System.out.println("Lista de clientes cadastrados:\n");
			for (int i = 0; i < lista.size(); i++) {
			    Cliente c = lista.get(i);
				System.out.println("Nome: "+c.getNome());
				System.out.println("Cpf: "+c.getCPF());
				System.out.println("Idade: "+c.getIdade());
				System.out.println("\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu um erro ao listar os clientes");
		}
	}
	
	public static void deletarCliente(String nome, List<Cliente> lista){
		try {
			lista.remove(nome);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu um erro ao deletar o cliente");
		}

	}
}
