package ex4;

public class Circulo extends FormaGeometrica{
	private double raio;
	
	// foi utilizada a biblioteca Math e o valor de PI dela
	public double valorPI = Math.PI;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return valorPI * (raio * raio);
	} 
	
	@Override
	public double calcularPerimetro() {
		return 2 * (valorPI * raio);
	}
}
