package ex3;

public class Moto extends Veiculo{
	private boolean farolLigado = false;
	private boolean acelerando = false;
	private boolean freiando = false;
	
	public Moto(boolean farolLigado, boolean acelerando, boolean freiando) {
		super(acelerando, freiando);
		this.farolLigado = farolLigado;
	}
	
	public void ligarFarol() {
		setFarolLigado(true);
		System.out.println("O farol da moto foi ligado.");
	}
	
	public void desligarFarol() {
		setFarolLigado(false);
		System.out.println("O farol da moto foi desligado.");
	}
	
	public boolean isFarolLigado() {
		return farolLigado;
	}

	private void setFarolLigado(boolean farolLigado) {
		this.farolLigado = farolLigado;
	}

	public boolean isAcelerando() {
		return acelerando;
	}

	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
		System.out.println("A moto está acelerando."); 
	}

	public boolean isFreiando() {
		return freiando;
	}

	public void setFreiando(boolean freiando) {
		this.freiando = freiando;
		System.out.println("A moto está reduzindo.");
	}
}
