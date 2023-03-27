package poo;

public class Medicamento extends Farmacia{
	
	private String tarja;

	public Medicamento(String nomeProd, String marcaOuLab, String categoria, double valor, int quantidade,
			String tarja) {
		super(nomeProd, marcaOuLab, categoria, valor, quantidade);
		this.tarja = tarja;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nTarja: "+tarja);
	}

}
