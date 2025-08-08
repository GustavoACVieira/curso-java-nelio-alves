package Recapitulando;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double d1 = sc.nextInt();
            double d2 = sc.nextInt();

            if (d2 == 0) {
                System.out.println("Divisão impossível!");
            } else {
                double divisao = d1 / d2;
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}
