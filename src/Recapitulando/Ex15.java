package Recapitulando;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Informe o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("O maior número é %d", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("O maior número é %d", num2);
        } else {
            System.out.printf("O maior número é %d", num3);
        }

        sc.close();
    }
}
