package src.Section9;

import java.util.Scanner;

public class MenuEx66 {
    public ProdutoEx66 menu(ProdutoEx66 produto) {
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite:\n1 - Adicionar\n2 - Remover\n3 - Total em Estoque\n4 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Quanto deseja adicionar? ");
                produto.adicionarEstoque(sc.nextInt());
                System.out.println("Produto atualizado: ");
                System.out.println(produto);
            } else if (opcao == 2) {
                System.out.println("Quanto deseja remover? ");
                produto.removerEstoque(sc.nextInt());
                System.out.println(produto);
            } else if (opcao == 3) {
                System.out.println("Valor Total em Estoque: ");
                produto.valorTotalEstoque();
                System.out.printf("R$ %.2f\n", produto.valorTotalEstoque());
            }
        } while (opcao != 4);

        sc.close();
        return produto;
    }
}
