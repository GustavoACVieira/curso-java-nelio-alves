package Section7;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        ehPar(n1);

        sc.close();
    }

    public static void ehPar(int num) {
        if (num % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
    }
}
