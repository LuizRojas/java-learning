package Ops;
import java.util.Scanner;

public class QuadradoDeUmValor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = entrada.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int exp = entrada.nextInt();
		
		double resultado = Math.pow(base, exp);		
		
		System.out.println(base + " elevado a " + exp + " eh igual a: " + resultado);
		
		entrada.close();
	}
}
