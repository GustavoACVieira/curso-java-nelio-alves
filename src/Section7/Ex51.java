package Section7;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        bitwisePar(num);

        sc.close();
    }

    public static void bitwisePar(int n) {
        if ((n & 1) == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }
    }
}
