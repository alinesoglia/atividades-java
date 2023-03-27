package poo;

public class Perfumaria extends Farmacia {
	
	private int lote;

	public Perfumaria(String nomeProd, String marcaOuLab, String categoria, double valor, int quantidade, int lote) {
		super(nomeProd, marcaOuLab, categoria, valor, quantidade);
		this.lote = lote;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nLote: "+lote);
	}

}
