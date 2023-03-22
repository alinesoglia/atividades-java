package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionList_Ex1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> listaCores = new ArrayList();
		
		for(int i=0; i<5;i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = leia.nextLine();
			listaCores.add(cor);
		}
		
		for(int i=0;i<listaCores.size();i++) {
			System.out.println("\nCores: "+listaCores.get(i));
		}

		Collections.sort(listaCores);
		System.out.println("\nCores ordenadas: "+listaCores);
	}

}
