/*Faça um programa para ler dois vetores A e B, contendo N elementos cada.
Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
elementos correspondentes de A e B. Imprima o vetor C gerado. */

package src.Section10;

import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declarando os vetores
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];

        //Preenchendo os mesmos
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
        }
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        //Printando os resultados
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }

        sc.close();
    }
}
