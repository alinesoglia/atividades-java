package poo;

public class Console extends Produto{
	
	private String console;

	public Console(String tituloJogo, double valor, String tipo, String marca, int quantidade, String console) {
		super(tituloJogo, valor, tipo, marca, quantidade);
		this.console = console;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nConsole: "+console);
	}

}
