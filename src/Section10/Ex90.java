/* Matriz transposta
Leia uma matriz 3x2 (3 linhas, 2 colunas) de inteiros.
Crie e exiba a matriz transposta (2x3).
 */

package src.Section10;

import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando matrizes
        int[][] matriz = new int[3][2];
        int[][] matrizTransposta = new int[2][3];

        //preenchendo matriz principal
        System.out.println("Digite os elementos da matriz 3x2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        //preenchendo matriz transposta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        //printando matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
