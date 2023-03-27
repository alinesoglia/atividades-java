package poo;

import java.text.NumberFormat;

public class Vip extends Ingresso {
	
	private double acrescimo;

	public Vip(String evento, String data, String comprador, double valor, int quantidade, double acrescimo) {
		super(evento, data, comprador, valor, quantidade);
		this.acrescimo = acrescimo;
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	public String formatarValor() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoValor = nf.format(acrescimo);
		return formatoValor;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nAcrescimo: "+this.formatarValor());
	}

}
