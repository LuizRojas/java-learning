package entidades;

public class Bebida extends Produto {  // significa que a classe bebida é uma classe filha de produto
	
	private String tipo;

	// alt + shift + s (para atalhos de criacao de construtor, getters, setters e afins
	public Bebida(int codigo, String nome, int estoque, double valorUnitario, String tipo) {
		super(codigo, nome, estoque, valorUnitario);  // inicializando a classe pai	
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}  
}
