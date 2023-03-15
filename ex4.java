package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("\nInforme o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("\nInforme o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("\nInforme o quarto valor: ");
		n4 = leia.nextFloat();
		
		calculo=(n1*n2)-(n3*n4);
		
		System.out.printf("\nA diferença é: %.2f", calculo);
	}
}
