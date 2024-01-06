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
			}
			case 2: {				
				listarClientes(listaClientes);
				break;
			}
			case 3: {				
				String nome = leia.nextLine();
				System.out.println("Informe o nome do cliente a ser deletado:");
				nome = leia.nextLine();
				deletarCliente(nome, listaClientes);
				System.out.println("Cliente deletado");
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
			
		}
								
	}
	
	public static Cliente cadastrarCliente(String nome, String cPF, int idade) {
		Cliente c = new Cliente(nome, cPF,idade);
		
		return c;
	}
	
	public static void listarClientes(List<Cliente> lista) {
		System.out.println("Lista de clientes cadastrados:\n");
		for (int i = 0; i < lista.size(); i++) {
            Cliente c = lista.get(i);
			System.out.println("Nome: "+c.getNome());
			System.out.println("Cpf: "+c.getCPF());
			System.out.println("Idade: "+c.getIdade());
			System.out.println("\n");
        }
	}
	
	public static void deletarCliente(String nome, List<Cliente> lista){
		lista.remove(nome);

	}
}
