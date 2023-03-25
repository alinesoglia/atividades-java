package poo;

public class testaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Aline", 31, 10000, "Desenvolvedora Java Junior", "27/03/2023");
		
		Funcionario func2 = new Funcionario("Beatriz", 28, 15000, "Desenvolvedora Java Pleno", "27/03/2020");
		
		func1.visualizar();
		func2.visualizar();

	}

}
