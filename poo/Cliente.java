package poo;

public class Cliente {
	
	private String nome;
	private int idade;
	private String sexo;
	private String estadoCivil;
	private String endereco;
	
	public Cliente (String nome, int idade, String sexo, String estadoCivil, String endereco) {
		super();
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
		this.estadoCivil=estadoCivil;
		this.endereco=endereco;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public void visualizar() {
		System.out.println("\nNome do cliente: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo
				+"\nEstado Civil: "+estadoCivil+"\nEndereço: "+endereco);
	}

}
