package animais;

public class Animal {
	private String nome;
	private String dono;
	private double peso;
	private int idade;
	
	public Animal(String nome, String dono, double peso, int idade) {
		this.nome = nome;	
		this.dono = dono;
		this.peso = peso;
		this.idade = idade;
	}
	
	public void fazerSom() {
		System.out.println("*Som de animal indescritivel*");
	}
	
	// getters e setters da classe
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String novoDono) {
		this.dono = novoDono;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double novoPeso) {
		this.peso = novoPeso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
}