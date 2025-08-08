package Recapitulando;
import java.util.Scanner;
import java.util.Locale;

public class Ex33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double p1 = 2, p2 = 3, p3 = 5;

        for (int i = 0; i < n; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}
