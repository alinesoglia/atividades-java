package poo;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Dixit", 200.00, "Tabuleiro", "Galapagos", 5);
		Produto produto2 = new Produto("Donkey Kong", 150.50, "Fita", "Nintendo", 3);
		
		produto1.visualizar();
		produto2.visualizar();

	}

}
