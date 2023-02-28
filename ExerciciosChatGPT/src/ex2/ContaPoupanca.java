package ex2;

public class ContaPoupanca extends ContaBancaria {
	private double taxaJurosMensal;

	public ContaPoupanca(double saldo, double taxaJurosMensal) {
		super(saldo);
		this.taxaJurosMensal = taxaJurosMensal;
	}
	
	// @override
	public void saque(double valorSaque) {
		if (valorSaque <= getSaldo()) {
			double novoSaldo = getSaldo() - (valorSaque + (valorSaque * getTaxaJurosMensal())); 
			setSaldo(novoSaldo);
		} else {
			System.out.println("Saldo indisponível para saque.");
		}
		System.out.println("Saldo atual: " + getSaldo());
	}
	
	public double getTaxaJurosMensal() {
		return taxaJurosMensal;
	}

	public void setTaxaJurosMensal(double taxaJurosMensal) { 
		this.taxaJurosMensal = taxaJurosMensal;
	}
}
