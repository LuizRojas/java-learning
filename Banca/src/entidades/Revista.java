package entidades;

public class Revista extends Produto {
	
	private String editora;

	public Revista(int codigo, String nome, int estoque, double valorUnitario, String editora) {
		super(codigo, nome, estoque, valorUnitario);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}
