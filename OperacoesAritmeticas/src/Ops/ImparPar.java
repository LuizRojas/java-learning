package Ops;
import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		System.out.println("Digite um valor para saber se ele eh par ou impar: ");
		int entrada = usuario.nextInt();
		
		if (entrada % 2 == 0) {
			System.out.println(entrada + " eh par");
		} else {
			System.out.println(entrada + " eh impar");
		}
		
		usuario.close();
	}	

}
