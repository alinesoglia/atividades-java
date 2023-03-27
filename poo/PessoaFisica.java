package poo;

public class PessoaFisica extends Cliente {
	
	private String Cpf;

	public PessoaFisica(String nome, int idade, String sexo, String estadoCivil, String endereco, String cpf) {
		super(nome, idade, sexo, estadoCivil, endereco);
		Cpf = cpf;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+
				"\nSexo: "+getSexo()+"\nEstado Civil: "+getEstadoCivil()+
				"\nEndereço: "+getEndereco()+"\nCPF: "+Cpf);
	}

}

