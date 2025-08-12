/*Peça para o usuário digitar 4 notas (valores decimais).
Armazene-as em um array de Double (wrapper).
Use unboxing para somar e calcular a média.
 */

package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex82 {
    public static final int LENGTH = 4;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarando e preenchendo o vetor arrayNotas
        System.out.println("Digite 4 notas: ");
        Double[] arrayNotas = new Double[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            arrayNotas[i] = sc.nextDouble();
        }

        //fazendo o unboxing e fazendo a média
        double average = 0;
        for (Double avg : arrayNotas) {
            average += avg;
        }
        average /= 4;

        //printando a média
        System.out.printf("MÉDIA = %.2f", average);

        sc.close();
    }
}
