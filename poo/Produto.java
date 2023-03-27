package poo;

import java.text.NumberFormat;

public class Produto {
	
	private String tituloJogo;
	private double valor;
	private String tipo;
	private String marca;
	private int quantidade;
	
	public Produto(String tituloJogo, double valor, String tipo, String marca, int quantidade) {
		super();
		this.tituloJogo = tituloJogo;
		this.valor = valor;
		this.tipo = tipo;
		this.marca = marca;
		this.quantidade = quantidade;
	}

	public String getTituloJogo() {
		return tituloJogo;
	}

	public void setTituloJogo(String tituloJogo) {
		this.tituloJogo = tituloJogo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
		System.out.println("\nTítulo do jogo: "+tituloJogo+"\nTipo: "+tipo+"\nMarca: "
	+marca+"\nValor: "+this.formatarMoeda()+"\nQuantidade em estoque: "+quantidade);
	}
	

}
