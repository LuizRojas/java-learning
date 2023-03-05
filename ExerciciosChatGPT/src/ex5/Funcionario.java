package ex5;

public class Funcionario extends Pessoa{
	private double salario = 0.00;
	private String cargo = "";
	
	@Override
	public String consultarInformacoes() {
		return "Salário atual do funcionario: " + getSalario() + "\nCargo atual do funcionário: " + getCargo() + "\n";
	}
	
	public void inserirInformacoes(double novoSalario, String novoCargo) {
		alteraInformacoes(novoSalario, novoCargo);
	}
	
	private void alteraInformacoes(double novoSalario, String novoCargo) {
		setSalario(novoSalario);
		setCargo(novoCargo);
	}

	public double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void inserirInformacoes() {
		// TODO Auto-generated method stub
		
	}
}
