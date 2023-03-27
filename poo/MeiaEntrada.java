package poo;

import java.text.NumberFormat;

public class MeiaEntrada extends Ingresso{
	
	private double desconto;

	public MeiaEntrada(String evento, String data, String comprador, double valor, int quantidade, double desconto) {
		super(evento, data, comprador, valor, quantidade);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public String formatarDesc() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoDesc = nf.format(desconto);
		return formatoDesc;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nDesconto: "+this.formatarDesc());
	}

}
