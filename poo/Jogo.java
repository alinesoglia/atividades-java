package poo;

public class Jogo extends Produto{
	
	private String estado;

	public Jogo(String tituloJogo, double valor, String tipo, String marca, int quantidade, String estado) {
		super(tituloJogo, valor, tipo, marca, quantidade);
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nEstado do jogo: "+estado);
	}

}
