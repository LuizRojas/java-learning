package acoes;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Fulano", 46);
		Pessoa pessoa2 = new Pessoa("Beltrano", 34);
		
		pessoa1.cumprimentar(pessoa2);
		pessoa1.falar("Salve " + pessoa2.getNome() + "!");
		pessoa2.falar("Eai meu(inha) nobre " + pessoa1.getNome() + ", tranquilo(a)?");
	}
}