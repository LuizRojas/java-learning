package entidades;

public class Doce extends Produto {
	
	private String sabor;

	public Doce(int codigo, String nome, int estoque, double valorUnitario, String sabor) {
		super(codigo, nome, estoque, valorUnitario);
		this.sabor = sabor;
	}
	
	public String getMarca() {
		return sabor;
	}
	
	public void setMarca(String nomeNovaMarca) {
		this.sabor = nomeNovaMarca;
	}
}
