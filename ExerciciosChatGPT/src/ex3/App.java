package ex3;

public class App {

	public static void main(String[] args) {
		Carro carro1 = new Carro(false, false, false);
		Moto moto1 = new Moto(false, false, false);
		
		carro1.abrirPortaMalas();
		carro1.fecharPortaMalas();
		carro1.setAcelerando(true);
		carro1.setAcelerando(false);
		
		System.out.println();
		
		moto1.ligarFarol();
		moto1.desligarFarol();
		moto1.setAcelerando(true);
		moto1.setAcelerando(false);
	}

}
