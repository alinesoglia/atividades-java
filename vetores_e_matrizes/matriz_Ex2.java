package vetores_e_matrizes;

import java.util.Scanner;

public class matriz_Ex2 {

	public static void main(String[] args) {
		
		float[][] notas = new float[10][4];
		int linha,coluna;
		float [] soma = new float [10];
		float [] medias = new float[10];
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0; linha<10; linha++) {
			for(coluna=0; coluna<4; coluna++) {
				System.out.println("\nEntre com as notas dos alunos: ");
				notas[linha][coluna] = leia.nextFloat();			
				}		
			
		}
		
		for(linha=0;linha<10;linha++) {
			for(coluna=0; coluna<4; coluna++) {
				soma[linha]+=notas[linha][coluna];
				medias[linha]=soma[linha]/4;
			}
			
		}
		
		
		for(linha=0;linha<10;linha++) {
			System.out.printf("\nMédias: %.1f",medias[linha]);
		}
		


	}

}
