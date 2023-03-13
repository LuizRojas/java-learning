package ex2;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaCorrente contaC001 = new ContaCorrente(500.0, 1200.0);
		
		boolean rodando = true;
		
		do {
			System.out.println("======= BEM-VINDO(A) AO BANCO JAVAX =======");
			System.out.println("Digite 1 - para depositar\n"
					+ "Digite 2 - para sacar\n"
					+ "Digite 3 - para visualizar *apenas* seu saldo\n"
					+ "Digite 4 - para sair\n");
			
			int opc = teclado.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Digite o valor a ser depositado: ");
					double deposito = teclado.nextDouble(); 
					contaC001.depositarValor(deposito);
					break;
				case 2:
					System.out.println("Digite o valor a ser sacado: ");
					double saque = teclado.nextDouble();
					contaC001.sacarValor(saque);
					break;
				case 3:
					System.out.println("Seu saldo é de: R$" + contaC001.getSaldo() + "\n");
					break;
				case 4:
					System.out.println("Saindo...\n===========================================");
					rodando = false;
					break;
				default:
					System.out.println("Digite um valor válido!");
			}
			
		} while (rodando);
		
		teclado.close();
	}

}
