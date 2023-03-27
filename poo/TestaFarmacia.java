package poo;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia prod1 = new Farmacia("Creme Hidratante", "Nivea", "Cosmético", 40.50, 12);
		Farmacia prod2 = new Farmacia("Xarope Vick", "Vick", "Remédio", 28.30, 8);
		
		prod1.visualizar();
		prod2.visualizar();

	}

}
