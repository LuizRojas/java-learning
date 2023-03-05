package ex3;

public class Carro extends Veiculo{
	private boolean portaMalasAberto = false;
	private boolean acelerando = false;
	private boolean freiando = false;
	
	public Carro(boolean portaMalasAberto, boolean acelerando, boolean freiando) {
		super(acelerando, freiando);
		this.portaMalasAberto = portaMalasAberto;
		this.acelerando = acelerando;
		this.freiando = freiando;
	}
	
	public void abrirPortaMalas() {
		setPortaMalasAberto(true);
		System.out.println("O porta malas do carro foi aberto.");
	}
	
	public void fecharPortaMalas() {
		setPortaMalasAberto(false);
		System.out.println("O porta malas do carro foi fechado.");
	}
	
	public boolean isPortaMalasAberto() {
		return portaMalasAberto;
	}

	private void setPortaMalasAberto(boolean portaMalasAberto) {
		this.portaMalasAberto = portaMalasAberto;
	}

	public boolean isAcelerando() {
		return acelerando;
	}

	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
		System.out.println("O carro está acelerando.");
	}

	public boolean isFreiando() {
		return freiando;
	}

	public void setFreiando(boolean freiando) {
		this.freiando = freiando;
		System.out.println("O carro está reduzindo.");
	}
	
	
		
}
