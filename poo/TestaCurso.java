package poo;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Libras", "3 anos", "Instituto Seli", 217.00, "Pós graduação");
		Curso curso2 = new Curso("Francês", "4 anos", "Aliança Francesa", 154.00, "Extensão");
		
		curso1.visualizar();
		curso2.visualizar();

	}

}
