package animais;

public class App {

	public static void main(String[] args) {
		Animal[] animais = new Animal[3];  // array de tres posicoes
		
		animais[0] = new Cachorro("Feijao", "Luiz", 15.25, 3, "vira-lata");
		animais[1] = new Cachorro("Cisco", "Luiz", 7.35, 1, "vira-lata");
		animais[2] = new Gato("Zezin", "Ronaldo", 3.62, 4, "siames");
		
		// loop para percorrer o array animais
		for (Animal animal : animais ) {
			
			if (animal instanceof Gato) {
				Gato gato = (Gato) animal;  // casting do tipo(classe) Animal para Cachorro
				System.out.println(animal.getNome() + " tem " + animal.getIdade() + " ano(s) e seu dono se chama " + animal.getDono() + ",\ngosta bastante da cor " + gato.getCor() + "\n");
			} else if (animal instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) animal;
				System.out.println(animal.getNome() + " tem " + animal.getIdade() + " ano(s) e seu dono se chama " + animal.getDono() + ",\ngosta bastante da raca " + cachorro.getRaca() + "\n");
			}
		}
	}
}