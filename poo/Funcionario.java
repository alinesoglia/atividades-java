package poo;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private int idade;
	private float salario;
	private String cargo;
	private String dataAdmissao;

	public Funcionario(String nome, int idade, float salario, String cargo, String dataAdmissao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String formatarMoeda() {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}

	public void visualizar() {
		System.out.println("\nNome do funcionário: " + nome + "\nIdade: " + idade + "\nSalário: " + this.formatarMoeda()
				+ "\nCargo: " + cargo + "\nData de admissão: " + dataAdmissao);
	}

}
