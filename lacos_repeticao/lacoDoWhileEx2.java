package lacos_repeticao;

import java.util.Scanner;

public class lacoDoWhileEx2 {

	public static void main(String[] args) {

		int numero, quant = 0;
		double x = 0, media;
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if ((numero != 0) && (numero % 3 == 0)) {
				x += numero;
				quant++;
			}

		} while (numero != 0);
		media = x / quant;
		System.out.println("A média de todos os números múltiplos de 3 é:" + media);
		leia.close();
	}

}
