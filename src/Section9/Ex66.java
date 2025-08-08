package src.Section9;

import java.util.Locale;
import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProdutoEx66 produto;

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço: ");
        double preco = sc.nextDouble();

        System.out.println("Existe uma quantidade inicial? (y/n)");
        char yOrN = sc.next().charAt(0);
        int qtd;
        if (yOrN == 'y') {
            System.out.println("Quanto? ");
            qtd = sc.nextInt();
            produto = new ProdutoEx66(nome, preco, qtd);
        } else {
            produto = new ProdutoEx66(nome, preco);
        }

        MenuEx66 menu = new MenuEx66();
        menu.menu(produto);

        System.out.println("Produto atualizado definitivo: ");
        System.out.println(produto);
        System.out.println("Valor Total em estoque: ");
        System.out.printf("R$ %.2f", produto.valorTotalEstoque());

        sc.close();
    }
}
