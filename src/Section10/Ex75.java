/*Fazer um programa para ler um vetor de N números inteiros.
Em seguida, mostrar na tela a média aritmética somente dos números pares lidos,
com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex75 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarando o array, a variável da média e a variável contadora de números pares
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] arrayPair = new int[n];
        double averagePair = 0.0;
        int countPair = 0;

        //preenchendo o array, somando na média de pares e contando quantos pares tem
        for (int i = 0; i < arrayPair.length; i++) {
            System.out.print("Digite um numero: ");
            arrayPair[i] = sc.nextInt();
            if (arrayPair[i] % 2 == 0) {
                averagePair += arrayPair[i];
                countPair++;
            }
        }

        //Condicional se tiver par ou não e printando os resultados
        if (averagePair == 0.0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            averagePair /= countPair;
            System.out.printf("\nMEDIA DOS PARES = %.1f", averagePair);
        }

        sc.close();
    }
}
