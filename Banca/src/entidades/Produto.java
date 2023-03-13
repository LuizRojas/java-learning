package entidades;

public abstract class Produto {  // é necessario criar subclasses filhas que realmente utilize seus metodos e atributos
	private int codigo;
	private String nome;
	private int estoque;
	private double valorUnitario;
	
	public Produto(int codigo, String nome, int estoque, double valorUnitario) {
		this.codigo = codigo;
		this.nome = nome;
		this.estoque = estoque;
		this.valorUnitario = valorUnitario;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	// void == sem retorno
	public void setCodigo(int novoCodigo) {
		this.codigo = novoCodigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(double novoValorUnitario) {
		this.valorUnitario = novoValorUnitario;
	}
	
	// metodos para alterar atributos *importantes*
	public void incluirEstoque(int quantidade) {
		estoque += quantidade;  // incluir (nesse caso) significa adicionar algo *a mais* ao que já era existente
	}
	
	public void retiraEstoque(int quantidade) {
		if (estoque >= quantidade) {
			estoque -= quantidade;
		} else {
			System.out.println("Estoque indisponivel!");
		}
	}
}
