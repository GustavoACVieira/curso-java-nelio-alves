/*Crie um programa que leia N nomes e armazene em uma lista.
Em seguida, peça ao usuário para informar uma letra.
O programa deve exibir apenas os nomes que começam com essa letra, usando stream e filter.
 */

package src.Section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex85 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando lista e o tamanho dela
        System.out.print("Quantos nomes vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> listNames = new ArrayList<>();

        //preenchendo a lista
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            listNames.add(sc.nextLine());
        }

        //letra que será filtrada
        System.out.print("Digite a letra para filtrar: ");
        char letter = sc.nextLine().charAt(0);

        //filtrando a lista para ter somente os nomes que começam coma  a letra
        List<String> listFiltraded = listNames.stream().filter(x -> x.charAt(0) == letter).toList();

        //printando a lista filtrada
        System.out.println("Nomes que começam com " + letter);
        for (String list : listFiltraded) {
            System.out.println(list);
        }
        sc.close();
    }
}
