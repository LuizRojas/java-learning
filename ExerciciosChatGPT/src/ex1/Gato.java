package ex1;

public class Gato extends Animal{
	private String som = "Miau miau";
	
	public Gato(String som) {
		super(som);
		this.som = som;
	}
	
	public void emitirSom() {
		System.out.println(getSom());
	}
	
	public String getSom() {
		return som;
	}
	
	public void setSom(String novoSom) {
		this.som = novoSom;
	}
}
