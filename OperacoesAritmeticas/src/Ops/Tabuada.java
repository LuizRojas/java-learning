package Ops;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor para ver sua tabuada: ");
		int valorTabuada = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(valorTabuada + " * " + i + " = " + (valorTabuada* i));
		}
		
		teclado.close();
	}
}
