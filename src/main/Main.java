package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condicao = 0;
		
		int idade = 0;
		String nome;
		
		int opcao;
		
		System.out.println("Escolha a opção: \n 1 - Cadastrar cliente.\n 0 - Sair");
		
		Scanner leia = new Scanner(System.in);
		opcao = leia.nextInt();
		
		
		while(opcao != 0) {
			nome = leia.nextLine();
			System.out.println("informe o nome do clinte\n");
			nome = leia.nextLine();
						
			System.out.println("informe a idade do clinte");			
			idade = leia.nextInt();
			
			System.out.println("Cliente cadastrado com sucesso!");
			
			System.out.println("Escolha a opção: \n 1 - Cadastrar cliente.\n 0 - Sair");				
			opcao = leia.nextInt();
						
		}
		
		System.out.println("Operação Finalizada!");
		
		
		
        
		

	}

}
