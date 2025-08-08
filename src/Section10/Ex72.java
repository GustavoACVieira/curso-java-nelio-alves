package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex72 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Declarando o vetor e as variaveis necessárias
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] arrayHigh = new double[n];
        double countHigh = 0.0;

        //preenchendo o vetor e captando o maior valor
        for (int i = 0; i < arrayHigh.length; i++) {
            System.out.print("Digite um numero: ");
            arrayHigh[i] = sc.nextDouble();
            if (countHigh < arrayHigh[i]) {
                countHigh = arrayHigh[i];
            }
        }

        //Printando os resultados
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f", countHigh);
        for (int i = 0; i < arrayHigh.length; i++) {
            if (countHigh == arrayHigh[i]) {
                System.out.println("\nPOSICAO DO MAIOR VALOR = " + i);
            }
        }

        sc.close();
    }
}
