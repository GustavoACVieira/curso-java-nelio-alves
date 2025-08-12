/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo. */

package src.Section10;

import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarando matriz e tamanho da linha e coluna
        System.out.println("Informe o valor M e N: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        //preenchendo matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        //preenchendo valor da ocorrência
        System.out.println("Valor ocorrência: ");
        int valorX = sc.nextInt();

        //verificando com base no valo da ocorrência,
        //os valores que estão em cima, baixo, na esquerda e direta do mesmo e printando
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorX) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
