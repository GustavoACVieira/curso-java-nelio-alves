/* Peça para o usuário digitar 5 números inteiros.
Armazene-os em um array de int.
Depois, crie um segundo array de Integer e faça a conversão (boxing) para ele.
Imprima os dois arrays lado a lado.
 */

package src.Section10;

import java.util.Scanner;

public class Ex81 {
    public static final int LENGTH = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando um array int e preenchendo o mesmo
        int[] arrayInt = new int[LENGTH];
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < LENGTH; i++) {
            arrayInt[i] = sc.nextInt();
        }

        //boxing automático
        Integer[] arrayInteger = new Integer[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            arrayInteger[i] = arrayInt[i];
        }

        //printando o array integer após o boxing
        System.out.println("\nint   | Integer");
        System.out.println("--------------");
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(arrayInt[i] + "     | " + arrayInteger[i]);
        }

        sc.close();
    }
}
