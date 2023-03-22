package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collectionList_Ex2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<Integer> lista = new ArrayList<Integer>();
		int cont=0;

		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		int numero = leia.nextInt();

		for (int i = 0; i < lista.size(); i++) {
			if (numero == lista.get(i)) {
				System.out.println("\nO número " + numero + " está localizado na posição: " + i);
				cont++;
			}

		}
		if(cont==0) {
			System.out.println("\nO número "+numero+" não foi encontrado!");
		}

	}

}
