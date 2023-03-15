package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nInforme a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nInforme a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("\nInforme a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nSua média final é: %.1f", media);
	}
}
