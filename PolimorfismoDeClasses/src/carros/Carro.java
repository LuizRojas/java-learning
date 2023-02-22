package carros;

public class Carro {
	private String modelo;
	private String marca;
	private String tipo;  // sedan, hatch, SUV etc.
	private String cor;
	private boolean ligado;
	private boolean acelerando;
	private int ano;
	
	public Carro(String modelo, String marca, String tipo, String cor, boolean ligado, boolean acelerando, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.tipo = tipo;
		this.cor = cor;
		this.ligado = ligado;
		this.acelerando = acelerando;
		this.ano = ano;
	}
	
	public void Ligar() {
		if (isLigado()) {
			System.out.println(marca + " " + modelo + " ja esta ligado.");
		} else {
			setLigado(true);
			System.out.println(marca + " " + modelo + " foi ligado.");
		}
	}
	
	public void Desligar() {
		if (!isLigado()) {
			System.out.println(marca + " " + modelo + " ja esta desligado.");
		} else {
			setLigado(false);
			System.out.println(marca + " " + modelo + " foi desligado.");
		}
	}
	
	public void Acelerar() {
		if (isLigado()) {
			System.out.println(marca + " " + modelo + " esta acelerando.");
		} else if (isAcelerando()) {
			System.out.println(marca + " " + modelo + " ja esta acelerando.");
		} else {
			System.out.println("Para acelerar " + marca + " " + modelo + " ligue-o.");
		}
	}
	
	public void ReduzirParar() {
		if (!isLigado()) {
			System.out.println(marca + " " + modelo + " nao pode reduzir, pois esta parado.");
		} else {
			System.out.println(marca + " " + modelo + " esta reduzindo.");
			setAcelerando(false);
			System.out.println(marca + " " + modelo + " parou.");
		} 	
	}
	
	// sera feito depois
	public void Abastecer() {}  
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	
	public boolean isLigado() {  // diferente dos demais metodos, por convencao da linguagem ao declarar um metodo booleano deve-se comecar com "is"
		return ligado;
	}
	
	public void setLigado(boolean estaLigado) {
		this.ligado = estaLigado;
	}
	
	public boolean isAcelerando() {
		 return acelerando;
	}
	
	public void setAcelerando(boolean estaAcelerando) {
		this.acelerando = estaAcelerando;
	}
	
	public int getAno() {
		return ano;
	}
	
	// na realidade não é possivel fazer isso, mas aqui é o Brasil!!!
	private void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	// foi criado um metodo publico para obter o valor de um atributo privado atraves de um metodo tambem privado, por motivos de seguranca
	public void definirAno(int novoAno) {
		setAno(novoAno);
	}
}