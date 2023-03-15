package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex1 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número (a): ");
		a=leia.nextInt();
		System.out.println("\nEntre com outro número (b): ");
		b=leia.nextInt();
		System.out.println("\nEntre com mais um número (c): ");
		c=leia.nextInt();
		
		if(a+b==c) {
			System.out.println("\nA soma de A + B é igual a C!!!");
		}else if(a+b>c) {
			System.out.println("\nA soma de A + B é maior do que C!!!");
		}else {
			System.out.println("\nA soma de A + B é menor do que C!!!");
		}

	}

}
