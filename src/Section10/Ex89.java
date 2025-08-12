/*Soma dos elementos de uma matriz
Crie um programa que leia uma matriz 3x3 de números inteiros.
Calcule e exiba a soma de todos os elementos da matriz.
Mostre também a soma de cada linha e de cada coluna separadamente.
 */

package src.Section10;

import java.util.Scanner;

public class Ex89 {
    public static final int LENGTH = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[LENGTH][LENGTH];

        //preenchendo a matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int sumTotal = 0;
        int[] somaLinhas = new int[LENGTH];
        int[] somaColunas = new int[LENGTH];

        //calculando somas
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                sumTotal += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        //exibindo resultados
        System.out.println("Soma total: " + sumTotal);
        for (int i = 0; i < LENGTH; i++) {
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinhas[i]);
        }
        for (int j = 0; j < LENGTH; j++) {
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColunas[j]);
        }
        sc.close();
    }
}