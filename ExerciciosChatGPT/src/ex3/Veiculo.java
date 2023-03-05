package ex3;

public class Veiculo {
	private boolean acelerando = false;
	private boolean freiando = false;
	
	public Veiculo(boolean acelerando, boolean freiando) {
		this.acelerando = acelerando;
		this.freiando = freiando;
	}

	public boolean isAcelerando() {
		return acelerando;
	}

	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
	}

	public boolean isFreiando() {
		return freiando;
	}

	public void setFreiando(boolean freiando) {
		this.freiando = freiando;
	}	
}