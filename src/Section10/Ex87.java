/* Crie uma classe Estoque com atributos id, nomeProduto e quantidade.
Construtor que receba todos os atributos
Construtor sobrecarregado que receba apenas id e nomeProduto (quantidade padrão = 0)
Métodos adicionar(int qtd) e remover(int qtd)
No main, crie uma lista de produtos e permita que o usuário adicione ou remova quantidades. */

package src.Section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando a lista e o tamanho da mesma
        System.out.print("Quantos produtos no estoque? ");
        int n = sc.nextInt();
        sc.nextLine();
        List<StockEx87> listStock = new ArrayList<>();

        //preenchendo a lista, e dando opcao de ter quantidade ou não
        for (int i = 0; i < n; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Deseja informar quantidade? (S/N) ");
            char opcao = sc.nextLine().charAt(0);

            if (opcao == 'S' || opcao == 's') {
                System.out.print("Quantidade: ");
                int quantity = sc.nextInt();
                listStock.add(new StockEx87(id, name, quantity));
            } else if (opcao == 'N' || opcao == 'n') {
                listStock.add(new StockEx87(id, name));
            }
            System.out.println();
        }

        //printando estoque atual
        System.out.println("Estoque: ");
        for (StockEx87 sto : listStock) {
            System.out.println(sto);
        }

        //adicionando produto no estoque
        System.out.print("Digite o ID do produto para adicionar estoque: ");
        int idAdd = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantityAdd = sc.nextInt();

        //removendo produto do estoque
        System.out.print("Digite o ID do produto para remover estoque: ");
        int idRemove = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantityRemove = sc.nextInt();

        //adicioanando e removendo com base nos metodos
        for (int i = 0; i < n; i++) {
            if (idAdd == listStock.get(i).getId()) {
                listStock.get(i).add(quantityAdd);
            }
            if (idRemove == listStock.get(i).getId()) {
                listStock.get(i).remove(quantityRemove);
            }
        }

        //printando o estoque atualizado
        System.out.println();
        System.out.println("Estoque atualizado: ");
        for (StockEx87 sto : listStock) {
            System.out.println(sto);
        }
        sc.close();
    }
}
