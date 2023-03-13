package entidades;

import java.util.Scanner;

public class MenuCadastroProduto {
    private static Scanner teclado = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("===== Bem-vindo(a) =====");
            System.out.println("Digite 1 - para cadastrar bebida");
            System.out.println("Digite 2 - para cadastrar revista");
            System.out.println("Digite 3 - para cadastrar doce");
            System.out.println("Digite 4 - para adicionar estoque de algum produto");
            System.out.println("Digite 5 - para retirar estoque de algum produto");
            System.out.println("Digite 0 - para sair\n-> ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarBebida();
                    break;
                case 2:
                    cadastrarRevista();
                    break;
                case 3:
                    cadastrarDoce();
                    break;
                case 4:
                    // adicionarEstoque();
                    break;
                case 5:
                    // retirarEstoque();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }

    private static void cadastrarBebida() {
        System.out.println("===== Cadastro de bebida =====");
        System.out.print("Digite o código da bebida: ");
        int codigo = teclado.nextInt();

        System.out.print("Digite o nome da bebida: ");
        String nome = teclado.next();

        System.out.print("Digite a quantidade em estoque da bebida: ");
        int estoque = teclado.nextInt();
        
        System.out.print("Digite o valor unitário da bebida: ");
        double valorUnitario = teclado.nextDouble();
        
        System.out.print("Digite o tipo da bebida (alcoolica, suco, refrigerante)");
        String tipoBebida = teclado.next();
        
        Bebida bebida = new Bebida(codigo, nome, estoque, valorUnitario, tipoBebida);
        // código para adicionar a bebida ao sistema de armazenamento de produtos
        // ...
    }

    private static void cadastrarRevista() {
        System.out.println("===== Cadastro de revista =====");
        System.out.print("Digite o código da revista: ");
        int codigo = teclado.nextInt();

        System.out.print("Digite o nome da revista: ");
        String nome = teclado.next();
        
        System.out.print("Digite a quantidade em estoque da revista: ");
        int estoque = teclado.nextInt();

        System.out.print("Digite o valor unitário da revista: ");
        double valorUnitario = teclado.nextDouble();
        
        System.out.print("Digite a editora da revista: ");
        String editora = teclado.next();

        Revista revista = new Revista(codigo, nome, estoque, valorUnitario, editora);
        // código para adicionar a revista ao sistema de armazenamento de produtos
        // ...
    }

    private static void cadastrarDoce() {
        System.out.println("===== Cadastro de doce =====");
        System.out.print("Digite o código do doce: ");
        int codigo = teclado.nextInt();

        System.out.print("Digite o nome do doce: ");
        String nome = teclado.next();
        
        System.out.print("Digite a quantidade de estoque do doce: ");
        int estoque = teclado.nextInt();
        
        System.out.print("Digite o valor unitario do doce: ");
        double valorUnitario = teclado.nextDouble();
        
        System.out.print("Digite o sabor do doce (azedo, doce, picante e congenlante): ");
        String sabor = teclado.next();
        
        Doce doce = new Doce(codigo, nome, estoque, valorUnitario, sabor);
    }
}
