package lacos_repeticao;

import java.util.Scanner;

public class lacoForEx1 {

	public static void main(String[] args) {
		
		int n1,n2,x;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o último número do intervalo: ");
		n2 = leia.nextInt();
		
		if(n1>=n2) {
			System.out.println("\nIntervalo inválido!");
		}
		
		for(x=n1;x<=n2;x++) { 
			
			if((x != 0) && (x % 3 == 0) && (x % 5 == 0)) {
				System.out.println(x + " é multiplo de 3 e 5");
			}
		}
		

	}

}
