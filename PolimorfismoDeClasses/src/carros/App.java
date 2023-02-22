package carros;

public class App {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Fiesta", "Ford", "Hatch", "branco", false, false, 2013); 
		carro1.Ligar();
		carro1.Acelerar();
		carro1.ReduzirParar();
	}
}
