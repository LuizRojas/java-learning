package animais;

public class Gato extends Animal {
	private String cor;
	
	public Gato(String nome, String dono, double peso, int idade, String cor) {
		super(nome, dono, peso, idade);
		this.cor = cor;
	}

	public void fazerSom() {
		System.out.println("Miau miau, você caiu no genjutsu do bial");
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
}