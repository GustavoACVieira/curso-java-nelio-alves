/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais.
Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais.
Depois mostrar todos os elementos do vetor que estejam abaixo da média,
com uma casa decimal cada.*/

package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex74 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Declarando o vetor e a variavel da média
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] arrayRealNumbers = new double[n];
        double average = 0.0;

        //preenchendo o vetor e fazendo a média
        for (int i = 0; i < arrayRealNumbers.length; i++) {
            System.out.print("Digite um numero: ");
            arrayRealNumbers[i] = sc.nextDouble();
            average += arrayRealNumbers[i];
        }
        average /= arrayRealNumbers.length;

        //Printando os resultados
        System.out.printf("\nMEDIA DO VETOR = %.3f", average);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < arrayRealNumbers.length; i++) {
            if (arrayRealNumbers[i] < average) {
                System.out.println(arrayRealNumbers[i]);
            }
        }

        sc.close();
    }
}
