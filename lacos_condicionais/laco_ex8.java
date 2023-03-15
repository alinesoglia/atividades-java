package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex8 {

	public static void main(String[] args) {
		
		int operacao;
		double saldo=1000.00,valor,novoSaldo;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n\t\tOperações");
		System.out.println("\n1- Saldo");
		System.out.println("\n2- Saque");
		System.out.println("\n3- Depósito");
		
		System.out.println("\nDigite a sua opção: ");
		operacao = leia.nextInt();
		
			
		switch(operacao) {
		
		case 1:
			System.out.println("\nO seu saldo é R$ " + saldo);
			break;
		case 2:
			System.out.println("\nInsira o valor a ser sacado: ");
			valor = leia.nextDouble();
			novoSaldo=saldo-valor;
			System.out.println("\nSeu novo saldo é R$ " + novoSaldo);
			break;
		case 3:
			System.out.println("\nInsira o valor a ser depositado: ");
			valor = leia.nextDouble();
			novoSaldo=saldo+valor;
			System.out.println("\nSeu novo saldo é R$ " + novoSaldo);
			break;
		default:
				System.out.println("\nOpção inválida!!!");
		}

	}

}
