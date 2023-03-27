package poo;

public class TestaIngresso {

	public static void main(String[] args) {
		
		Ingresso evento1 = new Ingresso("Lollapalooza", "25/03/2023", "Aline Soglia", 650.00, 2);
		Ingresso evento2 = new Ingresso("Show Remobilia", "20/04/2023", "Aline Soglia", 85.00, 2);
		
		evento1.visualizar();
		evento2.visualizar();

	}

}
