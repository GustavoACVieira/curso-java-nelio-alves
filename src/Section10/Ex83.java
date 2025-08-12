/* Peça para o usuário digitar 3 números inteiros e guarde-os em um array de Integer.
Peça para o usuário informar outro número inteiro e verifique:
Se existe no array (usando .equals())
Se o == também retorna verdadeiro ou não (explicar diferença)
 */

package src.Section10;

import java.util.Scanner;

public class Ex83 {
    public static final int LENGTH = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando o array integer e preenchendo o mesmo
        Integer[] arrayInteger = new Integer[LENGTH];
        System.out.println("Digite 3 números: ");
        for (int i = 0; i < LENGTH; i++) {
            arrayInteger[i] = sc.nextInt();
        }

        //numero a ser comparado
        System.out.println("Informe outro número: ");
        int num = sc.nextInt();

        //comparando e printando
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(arrayInteger[i].equals(num));
            System.out.println(arrayInteger[i] == num);
            System.out.println();
        }

        sc.close();
    }
}
