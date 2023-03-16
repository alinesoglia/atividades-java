package lacos_repeticao;

import java.util.Scanner;

public class lacoDoWhileEx1 {

	public static void main(String[] args) {
		
		int numero,resultado=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if(numero>0) {
				resultado+=numero;
			}
			
			
		}while(numero!=0);
		
		System.out.println("A soma dos números positivos é:"+resultado);
		
	}

}
