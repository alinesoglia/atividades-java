package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex7 {

	public static void main(String[] args) {
		
		float numero1,numero2,resultado;
		int operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o 1º número: ");
		numero1 = leia.nextFloat();
		System.out.println("Insira o 2º número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\n\t\tOperações");
		System.out.println("\n1- Soma");
		System.out.println("\n2- Subtração");
		System.out.println("\n3- Multiplicação");
		System.out.println("\n4- Divisão");
		
		System.out.println("\nDigite a sua opção: ");
		operacao = leia.nextInt();
		
			
		switch(operacao) {
		
		case 1:
			resultado = numero1 + numero2; 
			System.out.println("\nO resultado da soma é = " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2; 
			System.out.println("\nO resultado da subtração é = " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2; 
			System.out.println("\nO resultado da multiplicação é = " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2; 
			System.out.println("\nO resultado da divisão é = " + resultado);
			break;
		default:
				System.out.println("\nOpção inválida!!!");
		}
	}

}
