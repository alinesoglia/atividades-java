package poo;

public class testaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Aline", 31, "Feminino", "Casada", "Travessa Adonias Filho, 25");
		
		Cliente cliente2 = new Cliente("Beatriz", 28, "Feminino", "Casada", "Travessa Adonias Filho, 25");
		
		
		cliente1.visualizar();
		cliente2.visualizar();
		
		
	}

}
