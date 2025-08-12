/* Crie uma classe Produto com atributos privados id, nome e preco. Implemente:
Construtor que use this
Getters e setters (mas não permita alterar o id depois de criado)
Metodo aplicarDesconto(double percentual)
No main, crie uma lista de produtos, aplique desconto em um deles
(buscando pelo id via stream().filter()), e exiba todos os produtos.
 */

package src.Section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex86 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarando lista e tamanho
        System.out.print("Quantos produtos? ");
        int n = sc.nextInt();
        sc.nextLine();
        List<ProductEx86> listProduct = new ArrayList<>();

        //preenchendo a lista
        for (int i = 0; i < n; i++) {
            System.out.println("Produto " + (i + 1) + "#");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            System.out.println();

            listProduct.add(new ProductEx86(id, name, price));
        }

        //id do produto que sofrerá desconto
        System.out.print("Digite o ID do produto para desconto: ");
        int idDiscount = sc.nextInt();

        //verificando se o id existe e se existir perguntando o desconto
        double percent = 0;
        ProductEx86 proDiscount = listProduct.stream().filter(x -> x.getId() == idDiscount).findFirst().orElse(null);
        if (proDiscount == null) {
            System.out.println("This id does not exits!");
        } else {
            System.out.print("Digite o percentual de desconto: ");
            percent = sc.nextDouble();
        }

        //efetuando o desconto
        for (int i = 0; i < n; i++) {
            if (listProduct.get(i).getId() == idDiscount) {
                listProduct.get(i).priceDeduction(percent);
            }
        }

        //printando os resultados
        for (ProductEx86 pro : listProduct) {
            System.out.println(pro);
        }
        sc.close();
    }
}
