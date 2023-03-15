package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nSeu novo salário é: %.2f", novoSalario);
	}
}
