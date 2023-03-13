/*Crie uma classe "Pessoa" com métodos para inserir e consultar informações
 *  como nome, idade e endereço. Crie duas subclasses: "Funcionario" e "Cliente".
 *  O "Funcionario" deve ter métodos para inserir e consultar informações como salário e cargo,
 *  enquanto o "Cliente" deve ter métodos para inserir e consultar informações como compras realizadas e valor total gasto.
 *  Use encapsulamento para proteger os dados e polimorfismo para chamar os métodos específicos de cada classe.
 **/

package ex5;

public class App {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.inserirInformacoes(651.80, "Aprendiz");
		System.out.println(funcionario1.consultarInformacoes());
		
		Cliente cliente1 = new Cliente();
		cliente1.alterarValorGasto(399.99);
		cliente1.inserirInformacoes();
		cliente1.inserirInformacoes();
		System.out.println(cliente1.consultarInformacoes());
		
	}

}
