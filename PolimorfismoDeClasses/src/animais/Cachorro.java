package animais;

public class Cachorro extends Animal {
	private String raca;
	
	// construtor da class
	public Cachorro(String nome, String dono, double peso, int idade, String raca) {
		super(nome, dono, peso, idade);  // inicializando a classe pai (Animal)
		this.raca = raca;
	}
	
	public void fazerSom() {
		System.out.println("Auau, olá aumigo");
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;
	}
}