package poo;

public class Gerente extends Funcionario {
	
	private String filial;

	public Gerente(String nome, int idade, float salario, String cargo, String dataAdmissao, String filial) {
		super(nome, idade, salario, cargo, dataAdmissao);
		this.filial = filial;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nFilial: "+filial);
	}

}
