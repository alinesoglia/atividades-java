package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha_Ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		while (true) {
			System.out.println("********************************************************");
			System.out.println("                                                        ");
			System.out.println("                                                        ");
			System.out.println("             1 - Adicionar Livro na Pilha               ");
			System.out.println("             2 - Listar todos os Livros                 ");
			System.out.println("             3 - Retirar Livro da Pilha                 ");
			System.out.println("             0 - Sair                                   ");
			System.out.println("                                                        ");
			System.out.println("                                                        ");
			System.out.println("********************************************************");
			System.out.println("Entre com a opção desejada: ");
			int opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma finalizado!");
				System.exit(0);

			}

			switch (opcao) {

			case 1:

				System.out.println("\nAdicionar Livro na Pilha: ");
				leia.nextLine();
				String novoLivro = leia.nextLine();
				pilha.push(novoLivro);
				System.out.println("\nPilha: " + pilha);
				System.out.println("\nLivro adicionado!");

				break;

			case 2:
				System.out.println("\nLista de livros na pilha: " + pilha);
				break;

			case 3:
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				}else {
					System.out.println(pilha.pop() + " foi retirado da pilha!");
					System.out.println("\nPilha: " + pilha);
				}
				
				break;

			default:
				System.out.println("\nOpção Inválida!!!");
				break;
			}
		}

	}

}
