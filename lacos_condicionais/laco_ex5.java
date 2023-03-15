package lacos_e_condicionais;

import java.util.Scanner;

public class laco_ex5 {

	public static void main(String[] args) {
		
		int item, quantidade, total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tProdutos");
		System.out.println("\n1- Cachorro Quente, R$ 10.00");
		System.out.println("\n2- X-Salada, R$ 15.00");
		System.out.println("\n3- X-Bacon, R$ 18.00");
		System.out.println("\n4- Bauru, R$ 12.00");
		System.out.println("\n5- Refrigerante, R$ 8.00");
		System.out.println("\n6- Suco de laranja, R$ 13.00");
		System.out.println("\nDigite a sua opção: ");
		item = leia.nextInt();
		
		System.out.println("\nDigite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(item) {
		
		case 1:
			total = quantidade * 10;
			System.out.println("\nProduto escolhido: Cachorro Quente" + "\nValor total: R$ " + total);
			break;
		case 2:
			total = quantidade * 15;
			System.out.println("\nProduto escolhido: X-Salada" + "\nValor total: R$ " + total);
			break;
		case 3:
			total = quantidade * 18;
			System.out.println("\nProduto escolhido: X-Bacon" + "\nValor total: R$ " + total);
			break;
		case 4:
			total = quantidade * 12;
			System.out.println("\nProduto escolhido: Bauru" + "\nValor total: R$ " + total);
			break;
		case 5:
			total = quantidade * 8;
			System.out.println("\nProduto escolhido: Refrigerante" + "\nValor total: R$ " + total);
			break;
		case 6:
			total = quantidade * 13;
			System.out.println("\nProduto escolhido: Suco de Laranja" + "\nValor total: R$ " + total);
			break;
		default:
				System.out.println("\nOpção inválida!!!");
		}

	}

}
