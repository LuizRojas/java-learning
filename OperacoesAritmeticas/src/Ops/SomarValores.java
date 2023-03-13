package Ops;
import java.util.Scanner;

public class SomarValores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = teclado.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("A soma dos valores eh: " + soma);
		teclado.close();
	}
}
