package ex1;

public class Pato extends Animal{
	private String som = "quack quack";
	
	public Pato(String som) {
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
