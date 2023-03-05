/*Crie uma classe abstrata "Animal" com um método "emitirSom()" abstrato.
Crie outras classes, como "Cachorro", "Gato" e "Vaca", que herdam da classe "Animal"
e implementam o método "emitirSom()" de forma diferente para cada animal.
*/

package ex1;

public class App {
	public static void main(String[] args) {
		Gato gato1 = new Gato();
		gato1.setSom("Miau miau");
		gato1.emitirSom();
	}	
}
