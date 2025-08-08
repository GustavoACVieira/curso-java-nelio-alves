package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um quantos números você deseja ler: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um número: ");
            array[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }

        sc.close();
    }
}
