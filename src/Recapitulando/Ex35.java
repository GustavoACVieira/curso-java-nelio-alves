package Recapitulando;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            if (n == 0) {
                System.out.println(1);
            } else {
                fatorial *= i;
            }
        }
        System.out.println(fatorial);

        sc.close();
    }
}
