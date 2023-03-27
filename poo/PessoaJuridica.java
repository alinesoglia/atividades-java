package poo;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, int idade, String sexo, String estadoCivil, String endereco, String cnpj) {
		super(nome, idade, sexo, estadoCivil, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+
				"\nSexo: "+getSexo()+"\nEstado Civil: "+getEstadoCivil()+
				"\nEndereço: "+getEndereco()+"\nCNPJ: "+cnpj);
	}
	

}
