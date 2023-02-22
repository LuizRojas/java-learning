package matrizes;

public class App {

	public static void main(String[] args) {
		int[][] zeros = new int[3][3];  // criando uma varia, para posteriormente ser preenchida com zeros
		
		System.out.println("Matriz 3x3 de zeros: ");
		
		for (int i = 0; i < zeros.length; i++) {
			for (int j = 0; j < zeros[i].length; j++) {
				System.out.print(zeros[i][j] + " ");
			}
			System.out.println();
		}
	}

}