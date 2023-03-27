package poo;

import java.text.NumberFormat;

public class Curso {
	
	private String curso;
	private String duracao;
	private String instituicao;
	private double valor;
	private String certificado;
	
	public Curso(String curso, String duracao, String instituicao, double valor, String certificado) {
		super();
		this.curso = curso;
		this.duracao = duracao;
		this.instituicao = instituicao;
		this.valor = valor;
		this.certificado = certificado;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCertificado() {
		return certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	
	public String formatarMoeda() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("\nCurso: "+curso+"\nDuração: "+duracao+"\nInstituição: "
	+instituicao+"\nValor mensalidade: "+this.formatarMoeda()+"\nTipo de certificação: "+certificado);
	}

}
