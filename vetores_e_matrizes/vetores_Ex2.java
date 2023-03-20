package vetores_e_matrizes;

import java.util.Scanner;

public class vetores_Ex2 {

	public static void main(String[] args) {
		
			
			int[] vet = new int[10];
			int soma=0, x;
			float media;
			
			Scanner leia = new Scanner(System.in);
			
			
			for(x=0;x<10;x++) {
				System.out.println("\nEntre com um número: ");
				vet[x] = leia.nextInt();
				soma+=vet[x];
				
			}
			
			System.out.println("Números ímpares: ");
			for(x=0;x<10;x++) {
				if(vet[x]%2 != 0 ) {
					System.out.print(vet[x]+", ");
					}
			}
			
			System.out.print("\nNúmeros pares: ");
			for(x=0;x<10;x++) {
				if(vet[x]%2 == 0 ) {
					System.out.print(vet[x]+", ");
					}	
			}
			
			media = soma/10;
			
			System.out.println("\nSoma: "+soma);
			System.out.printf("\nMédia : %.2f",media);

	}

}
