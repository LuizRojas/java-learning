package ex5;
import java.util.Scanner;

public class Cliente extends Pessoa{
	private String[] comprasRealizadas = new String[20];  // um cliente pode comprar até 20 itens distintos
	private double valorGasto = 0.00;
	
	public void lerComprasFeitas() {
		
	}
	
	@Override
	public String consultarInformacoes() {
		String compras = "";
		System.out.println("Compras do cliente: ");
		
		for (String compra : getCompras()) {
			if (compra != null) {
				compras += compra;
			}
		}
		
		return "Suas compras: " + compras + "\nValor total gasto: " + getValorGasto();
	}
	
	public void inserirInformacoes() {
		setCompras();
	}	
	
	public void alterarValorGasto(double novoValorGasto) {
		setValorGasto(novoValorGasto);
	}
	
	public String[] getCompras() {
		return comprasRealizadas;
	}
	
	private void setCompras() {
	    Scanner scanner = new Scanner(System.in);
	    String[] comprasCliente = getCompras();
	    int i = 0;

	    while (true) {
	        System.out.println("Digite a compra " + i + " (ou digite 'fim' para parar): ");
	        String compra = scanner.next();

	        if (compra.equalsIgnoreCase("fim")) {
	            break;
	        }

	        comprasCliente[i] = compra;
	        i++;

	        if (i >= comprasCliente.length) {
	            System.out.println("Limite máximo de compras atingido.");
	            break;
	        }
	    }

	    scanner.close();
	}
	
	public double getValorGasto() {
		return valorGasto;
	}
	
	private void setValorGasto(double novoValorGasto) {
		this.valorGasto = novoValorGasto;
	}

	@Override
	public void inserirInformacoes() {
		// TODO Auto-generated method stub
		
	}
	
}
