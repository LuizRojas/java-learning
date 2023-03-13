package ex5;
import java.util.NoSuchElementException;
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
				if (!compra.isEmpty()) {
					compras += (compras.isEmpty() ? "" : ", ");  // a partir de agora a primeira entrada não terá mais vírgula antes dela, mas as próximas sim
				}
				compras += compra;
			}
		}
		
		return "Suas compras: " + compras + "\nValor total gasto: " + getValorGasto();
	}
	
	@Override
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
	    
	    // tratamento de erros, para quando não for necessário mais a entrada de dados
	    try { 
		    while (true) {
		        System.out.println("Digite a compra " + i + " (ou digite 'fim' para parar): ");
		        String compra = scanner.next();
	
		        if (compra.trim().equalsIgnoreCase("fim")) {
		            break;
		        }
	
		        comprasCliente[i] = compra;
		        i++;
	
		        if (i >= comprasCliente.length) {
		            System.out.println("Limite máximo de compras atingido.\n");
		            break;
		        }
		    }
	    } catch (NoSuchElementException e) {
	    	System.out.println("Entrada inválida. Tente novamente.\n");
	    } finally {
	    	scanner.close();
	    }
	}
	
	public double getValorGasto() {
		return valorGasto;
	}
	
	private void setValorGasto(double novoValorGasto) {
		this.valorGasto = novoValorGasto;
	}
}
