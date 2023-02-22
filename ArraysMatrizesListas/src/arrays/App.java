package arrays;
import java.util.Scanner;
import java.util.Arrays;  // modulo para manipular arrays

public class App {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] alunos = new String[6];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Insira o nome do aluno " + i + ": ");
			alunos[i] = teclado.nextLine();
		}
		
		Arrays.sort(alunos);
		System.out.println("\nOs nomes dos alunos (em ordem alfabetica): ");
		
		for (String aluno : alunos) {
			System.out.print(aluno + " ");
		}
		
		teclado.close();
	}
}
