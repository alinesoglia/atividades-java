package poo;

import java.text.NumberFormat;

public class Ingresso {
	
	private String evento;
	private String data;
	private String comprador;
	private double valor;
	private int quantidade;
	
	public Ingresso(String evento, String data, String comprador, double valor, int quantidade) {
		super();
		this.evento = evento;
		this.data = data;
		this.comprador = comprador;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
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
		System.out.println("\nEvento: "+evento+"\nData: "+data+"\nNome do Comprador: "+
	comprador+"\nValor do ingresso: "+this.formatarMoeda()+"\nQuantidade de ingressos: "+
				quantidade);
	}

}
