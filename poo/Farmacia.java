package poo;

import java.text.NumberFormat;

public class Farmacia {
	
	private String nomeProd;
	private String marcaOuLab;
	private String categoria;
	private double valor;
	private int quantidade;
	
	public Farmacia(String nomeProd, String marcaOuLab, String categoria, double valor, int quantidade) {
		super();
		this.nomeProd = nomeProd;
		this.marcaOuLab = marcaOuLab;
		this.categoria = categoria;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getMarcaOuLab() {
		return marcaOuLab;
	}

	public void setMarcaOuLab(String marcaOuLab) {
		this.marcaOuLab = marcaOuLab;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String formatarMoeda() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("\nProduto: "+nomeProd+"\nMarca/Laboratório: "+marcaOuLab
				+"\nCategoria: "+categoria+"\nValor: "+this.formatarMoeda()
				+"\nQuantidade em estoque: "+quantidade);
	}
	
	

}
