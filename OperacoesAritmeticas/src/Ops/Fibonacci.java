package Ops;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int t1 = 0, t2 = 1, t3;
		
		int termos = teclado.nextInt();
		
		for (int i = 0; i < termos; i++) {
			
			t3 = t1 + t2;			
			t1 = t2;
			t2 = t3;
			
			System.out.println("Elemento " + i + ": " + t3);
		}
		
		teclado.close();
	}

}
