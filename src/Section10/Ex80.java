/* Soma de valores (for-each + boxing + unboxing) */

package src.Section10;

import java.util.Locale;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //preenchendo vetor
        double[] valor = new double[5];
        double sum = 0.0;
        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            valor[i] = sc.nextDouble(); //boxing
        }

        //for each
        for (Double Valor : valor) {
            sum += Valor; //unboxing
        }

        System.out.printf("SOMA DO VETOR = %.2f", sum);

        sc.close();
    }
}
