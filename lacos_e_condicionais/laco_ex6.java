package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex6 {

	public static void main(String[] args) {
		
		String nome;
		int cargo;
		double salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu nome");
		nome = leia.nextLine();
		
		System.out.println("\n\t\tCargos");
		System.out.println("\n1- Gerente");
		System.out.println("\n2- Vendedor");
		System.out.println("\n3- Supervisor");
		System.out.println("\n4- Motorista");
		System.out.println("\n5- Estoquista");
		System.out.println("\n6- Técnico de TI");
		System.out.println("\nDigite a sua opção: ");
		cargo = leia.nextInt();
		
		System.out.println("\nDigite seu salário: ");
		salario = leia.nextDouble();
		
		switch(cargo) {
		
		case 1:
			novoSalario = salario + (0.1*salario); 
			System.out.println(nome + ", você é Gerente e seu novo salário é R$ " + novoSalario);
			break;
		case 2:
			novoSalario = salario + (0.07*salario); 
			System.out.println(nome + ", você é Vendedor(a) e seu novo salário é R$ " + novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09*salario); 
			System.out.println(nome + ", você é Supervisor(a) e seu novo salário é R$ " + novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06*salario); 
			System.out.println(nome + ", você é Motorista e seu novo salário é R$ " + novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05*salario); 
			System.out.println(nome + ", você é Estoquista e seu novo salário é R$ " + novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08*salario); 
			System.out.println(nome + ", você é Técnico(a) de TI e seu novo salário é R$ " + novoSalario);
			break;
		default:
				System.out.println("\nOpção inválida!!!");
		}

	}

}
