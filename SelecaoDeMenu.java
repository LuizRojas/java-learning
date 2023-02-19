import java.util.Scanner;

public class SelecaoDeMenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Selecione um menu para navegar:\nDigite 1 para exibir o menu de cadastro\nDigite 2 para sair\n-> ");
        int opt = teclado.nextInt();
        
        if (opt == 1) {
            System.out.println("Digite seu nome: ");
            String nome = teclado.next();
            
            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();
            
            System.out.println("Seja bem vindo(a) " + nome);
            
            if (idade >= 18) {
                System.out.println("Usuario cadastrado com sucesso no banco de dados!\nVolte mais tarde, estamos Offline.");
            } else {
                System.out.println("Parece que voce nao tem idade sufiente para proseguir :(");
            }
        } else {
            System.out.println("O usuario escolheu sair, volte sempre! :D");
        }
        teclado.close();
    }
}
