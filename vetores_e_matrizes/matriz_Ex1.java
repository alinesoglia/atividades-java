package vetores_e_matrizes;

import java.util.Scanner;

public class matriz_Ex1 {

	public static void main(String[] args) {
		
		int[][] numeros = new int[3][3];
		int linha,coluna,somaPrincipal=0,somaSecundaria=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0; linha<3; linha++) {
			for(coluna=0; coluna<3; coluna++) {
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				if(linha == coluna) {
					somaPrincipal += numeros[linha][coluna];
				}
				if(linha == 0 && coluna == 2) {
					somaSecundaria += numeros[linha][coluna] ;
				}else if(linha == 1 && coluna==1){
					somaSecundaria += numeros[linha][coluna] ;
				}else if(linha == 2 && coluna == 0) {
					somaSecundaria += numeros[linha][coluna]; 
					}
				}
		}
		System.out.println("\nElementos da Diagonal Principal: "+numeros[0][0]+", "+numeros[1][1]+", "+numeros[2][2]);
		System.out.println("\nElementos da Diagonal Principal: "+numeros[0][2]+", "+numeros[1][1]+", "+numeros[2][0]);
		System.out.println("\nSoma dos valores da diagonal principal: " + somaPrincipal);
		System.out.println("\nSoma dos valores da diagonal secundária: "+somaSecundaria);

	}

}
