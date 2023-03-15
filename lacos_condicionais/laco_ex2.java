package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero=leia.nextInt();
		
		
		if(numero%2==0 && numero<0) {
			System.out.println("\nO número inserido é par e negativo!");
		}else if(numero%2!=0 && numero<0) {
			System.out.println("\nO número inserido é ímpar e negativo!");
		}else if(numero%2!=0 && numero>0){
			System.out.println("\nO número inserido é ímpar e positivo!");
		}else if(numero%2==0 && numero>0) {
			System.out.println("\nO número inserido é par e positivo!");
		}

	}

}
