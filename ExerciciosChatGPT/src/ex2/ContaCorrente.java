package ex2;

public class ContaCorrente extends ContaBancaria{
	private double limiteSaque;
	
	public ContaCorrente(double limiteSaque, double saldo) {
		super(saldo);
		this.limiteSaque = limiteSaque;
	}
	
	//@Override  // decorator para sobrepor o método da classe pai ContaBancaria adicionando algumas funcionalidades
	public void saque(double valorSaque) {
		if (valorSaque <= getSaldo() && (valorSaque < getLimiteSaque())) {
			System.out.println("Saque de R$" + valorSaque + " efetuado com sucesso");
			sacarValor(valorSaque);
		} else {
			System.out.println("Saldo ou limiteSaque indisponível para saque.");
		}
		System.out.println("Saldo atual: " + getSaldo());
	}
	
	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		if (limiteSaque > getSaldo()) {
			System.out.println("Infelizmente não será possível alterar o limite para este valor, pois é maior que o saldo.");
		} else {
			this.limiteSaque = limiteSaque;
		}
	}
}
