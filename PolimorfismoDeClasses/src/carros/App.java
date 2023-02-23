package carros;

public class App {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Chevette", "Chevrolet", "Sedan", "prata", false, false, true, 1997); 
		carro1.ligar();
		carro1.acelerar();
		carro1.reduzirParar();
		carro1.desligar();
	}
}
