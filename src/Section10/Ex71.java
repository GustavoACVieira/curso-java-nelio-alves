/*Objetivo: Faça um programa que leia N números inteiros e armazene-os em um vetor.
Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.*/

package src.Section10;

import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lendo quantos o tamanho do array e declarando as variaveis necessárias
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] arrayPair = new int[n];
        int countPair = 0;

        //Guardando os valores no array e contando quantos pares tem
        for (int i = 0; i < arrayPair.length; i++) {
            System.out.print("Digite um numero: ");
            arrayPair[i] = sc.nextInt();
            if (arrayPair[i] % 2 == 0) {
                countPair++;
            }
        }

        //Printando os resultados
        System.out.println("NUMETOS PARES: ");
        for (int i = 0; i < arrayPair.length; i++) {
            if (arrayPair[i] % 2 == 0) {
                System.out.print(arrayPair[i] + "  ");
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + countPair);

        sc.close();
    }
}
