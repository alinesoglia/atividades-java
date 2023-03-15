package exercicios;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nInforme o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nInforme as Horas Extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nInforme os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido=salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
		
		System.out.printf("\nSeu salário líquido é: %.2f", salarioLiquido);
	}

}
