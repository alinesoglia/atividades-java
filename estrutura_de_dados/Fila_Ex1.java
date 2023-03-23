package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_Ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		while (true) {
			System.out.println("********************************************************");
			System.out.println("                                                        ");
			System.out.println("                                                        ");
			System.out.println("             1 - Adicionar Cliente na Fila              ");
			System.out.println("             2 - Listar todos os Clientes               ");
			System.out.println("             3 - Retirar Cliente da Fila                ");
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

				System.out.println("\nAdicionar Cliente na Fila: ");
				leia.nextLine();
				String novoCliente = leia.nextLine();
				fila.add(novoCliente);
				System.out.println("\nFila: "+fila);
				System.out.println("\nCliente adicionado!");

				break;

			case 2:
				System.out.println("\nListar todos os clientes: " + fila);
				break;

			case 3:
				
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
					System.out.println(fila.poll()+"\nO cliente foi chamado!");
					System.out.println("Fila: "+fila);
				}
				
				break;

			default:
				System.out.println("\nOpção Inválida!!!");
				break;
			}
		}

	}

}
