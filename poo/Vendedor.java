package poo;

import java.text.NumberFormat;

public class Vendedor extends Funcionario {
	
	private double meta;

	public Vendedor(String nome, int idade, float salario, String cargo, String dataAdmissao, double meta) {
		super(nome, idade, salario, cargo, dataAdmissao);
		this.meta = meta;
	}

	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}
	
	public String formatarMoeda() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(meta);
		return formatoMoeda;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nMeta mensal do vendedor: "+this.formatarMoeda());
	}

}
