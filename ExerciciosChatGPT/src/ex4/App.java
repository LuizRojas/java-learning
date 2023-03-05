/*Crie uma classe "FormaGeometrica" abstrata com métodos para calcular área e perímetro.
 *  Crie outras classes, como "Retangulo", "Circulo" e "Triangulo", que herdam da classe
 *   "FormaGeometrica" e implementam os métodos de forma diferente para cada forma.*/

package ex4;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// retangulo
		System.out.println("Digite o valor da base do retangulo: ");
		double baseRetangulo = scanner.nextDouble();
		
		System.out.println("Digite o valor da altura do retangulo: ");
		double alturaRetangulo = scanner.nextDouble();
		
		Retangulo retangulo1 = new Retangulo(baseRetangulo, alturaRetangulo);
		double areaRetangulo = retangulo1.calcularArea();
		double perimetroRetangulo = retangulo1.calcularPerimetro();
		
		System.out.println("A área do retângulo: " + areaRetangulo + "\nO perímetro do retângulo: " + perimetroRetangulo);
		
		// circulo
		System.out.println("\nDigite o valor do raio do circulo: ");
		double raioCirculo = scanner.nextDouble();
		
		Circulo circulo1 = new Circulo(raioCirculo);
		double areaCirculo = circulo1.calcularArea();
		double perimetroCirculo = circulo1.calcularPerimetro();
		
		System.out.println("\nA área do círculo: " + areaCirculo + "\nO perímetro do círculo: " + perimetroCirculo);
		
		// triangulo 
		double[] ladosTriangulo = new double[3];
		for (int i = 0; i < ladosTriangulo.length; i++) {
			System.out.println("\nDigite o lado " + i + 1 + " do triângulo: ");
			ladosTriangulo[i] = scanner.nextDouble();
		}
		
		Triangulo triangulo1 = new Triangulo(ladosTriangulo[0], ladosTriangulo[1], ladosTriangulo[2]);
		double areaTriangulo = triangulo1.calcularArea();
		double perimetroTriangulo = triangulo1.calcularPerimetro();
		
		System.out.println("\nA área do triângulo: " + areaTriangulo + "\nO perímetro do triângulo: " + perimetroTriangulo);
		
		scanner.close();
	}

}
