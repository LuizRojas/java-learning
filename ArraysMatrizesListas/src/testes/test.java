package testes;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de elementos do vetor: ");
		int numElementos = teclado.nextInt();
		
		int[] valores = new int[numElementos];  // o tamanho do array é determinado pelo valor que o usuario digitar
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor do " + (i+1) + "º elemento: ");
			int valor = teclado.nextInt();
			valores[i] = valor;
		}
		
		System.out.println("Exibindo elementos do vetor valores: ");
		for (int valor : valores) { 
			System.out.println(valor);
		}
		
		teclado.close();
	}
}
