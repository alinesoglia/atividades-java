package lacos_repeticao;

import java.util.Scanner;

public class lacoForEx2 {

	public static void main(String[] args) {
		
		int par=0, impar=0, numero;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1; x<=10; x++) {
			System.out.println("Digite o " + x +"º número: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
	
		System.out.println("Total de números pares: "+par);
		System.out.println("Total de números ímpares: "+impar);
		
	}

}
