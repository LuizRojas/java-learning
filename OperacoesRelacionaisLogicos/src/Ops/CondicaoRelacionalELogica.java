package Ops;
import java.util.Scanner;

public class CondicaoRelacionalELogica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = teclado.nextInt();
		System.out.println("Digite um outro valor: ");
		int num2 = teclado.nextInt();
		
		int numExemplo = 34;
		
		if (num1 > numExemplo && num2 > numExemplo) {
			System.out.println("Ambos os valores inseridos pelo usuario sao maiores que " + numExemplo);
		} else if (num1 > numExemplo || num2 > numExemplo) {
			System.out.println("Pelo menos um dos valores digitados pelo usuario eh maior que " + numExemplo);
		}
		
		if (num1 < numExemplo && num2 < numExemplo) {
			System.out.println("Ambos os valores inserifos pelo usuario sao menores que " + numExemplo);
		} else if (num1 < numExemplo || num2 < numExemplo) {
			System.out.println("Pelo menos um dos valores digitados pelo usuario eh menor que " + numExemplo);
		}
		
		teclado.close();
	}	

}