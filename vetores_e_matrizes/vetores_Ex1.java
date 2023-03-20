package vetores_e_matrizes;

import java.util.Scanner;

public class vetores_Ex1 {

	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int x, numero, cont=0;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		for (x = 0; x < 10; x++) {

			if (vetor[x] == numero) {
				System.out.println("\nO número " + numero + " está na posição " + (x+1));
				cont++;
			} 			
		}
		if(cont==0) {
			
				System.out.println("\nO número " + numero + " não foi encontrado!");

		}
	}

}
