/* Busca de elemento e contagem
Leia uma matriz 4x4 de inteiros.
Peça ao usuário um número X.
Mostre todas as posições (linha e coluna) onde X aparece na matriz e conte quantas vezes ele aparece.
 */

package src.Section10;

import java.util.Scanner;

public class Ex91 {
    public static final int LENGTH = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando matriz
        int[][] matriz = new int[LENGTH][LENGTH];

        System.out.println("Preencha a matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Informe número a ser verificado: ");
        int num = sc.nextInt();

        //if a matriz[i][j] for igual a num printa a linha e coluna e adiciona mais 1 no countNum
        int countNum = 0;
        System.out.println("Número " + num + " encontrado nas posições: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("[" + i + "]" + "[" + j + "]");
                    countNum++;
                }
            }
        }
        System.out.println("Total de ocorrências: " + countNum);
        sc.close();
    }
}
