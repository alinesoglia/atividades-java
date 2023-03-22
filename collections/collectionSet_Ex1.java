package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collectionSet_Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		for(int i=0; i<10;i++) {
			System.out.println("\nDigite um número inteiro: ");
			int numero = leia.nextInt();
			meuSet.add(numero);
		}
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		System.out.println("Listar dados do Set: ");
		while(iMeuSet.hasNext()) {
			
			System.out.println(iMeuSet.next());
		}

	}

}
