/*Crie uma classe "ContaBancaria" com métodos para depositar,
 *  sacar e consultar saldo. Crie duas subclasses: "ContaCorrente"
 *  e "ContaPoupanca". A "ContaCorrente" deve permitir um limite para saques,
 *  enquanto a "ContaPoupanca" deve ter uma taxa de juros mensal.
 *  Use polimorfismo para chamar os métodos específicos de cada conta.
 */

package ex2;

public class ContaBancaria {
	private double saldo = 0.0;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	private void saque(double valorSaque) {
		if (valorSaque > getSaldo()) {
			System.out.println("Seu saldo é indisponível para esta operação");
		} else {
			setSaldo(getSaldo() - valorSaque);
			System.out.println("Valor sacado com sucesso.\n");
		}
	}
	
	public void sacarValor(double valor) {
		saque(valor);
	}
	
	private void depositar(double valorDeposito) {
		setSaldo(getSaldo() + valorDeposito);
		System.out.println("Valor depositado com sucesso.\n");
	}
	
	public void depositarValor(double valor) {
		depositar(valor);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
