package ex1;

public abstract class Animal {
	private String som = "Som indefinido";
	
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
