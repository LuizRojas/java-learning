package acoes;

public class Pessoa {
	private String nome;  // atributo privado da classe Pessoa: nome
	private int idade;
	private boolean falando;
	private boolean cumprimentando;
	
	public Pessoa(String nome, int idade) {  // contrutor da classe
		this.nome = nome;  // referencia o proprio nome do objeto dessa classe
		this.idade = idade;
		this.falando = false;  // estado inicial da variavel
		this.cumprimentando = false;
	}

	public void falar(String mensagem) {
		if (!this.isFalando()) {  // a expressao é negada para verificar se a pessoa não está falando
			this.setFalando(true);  // definir a variavel falando para true
			System.out.println(nome + " está falando: " + mensagem);
			this.setFalando(false);  // definiar a variavel falando para false
		} else {
			System.out.println(this.nome + " já está falando, não pode falar novamente.");
		}
	}
	
	public void cumprimentar(Pessoa outraPessoa) {
		if (isCumprimentando()) {
			System.out.println(nome + " está falando e não pode cumprimentar " + outraPessoa.getNome());
		} else {
			System.out.println("Opa, " + outraPessoa.getNome() + "! Meu nome é " + nome + ", tenho " + getIdade() + " anos");
		}
	}
	
	public boolean isFalando() {
		return this.falando;
	}
	
	public void setFalando(boolean falando) {
		this.falando = falando;
	}
	
	public boolean isCumprimentando() {
		return this.cumprimentando;
	}
	public void setCumprimentando(boolean cumprimentando) {
		this.cumprimentando = cumprimentando;
	}
	
	public String getNome() {  // getter de uma classe, retorna (pega) o valor de um atributo determinado pelo mesmo
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
}
