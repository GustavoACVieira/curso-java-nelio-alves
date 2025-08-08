package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;

        System.out.print("VALORES = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.printf("\nSOMA = %.2f", sum);
        System.out.printf("\nMEDIA = %.2f",average);

        sc.close();
    }
}
