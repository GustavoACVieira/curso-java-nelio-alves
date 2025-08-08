package Recapitulando;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é o maior!", num1);
        } else {
            System.out.printf("O número %d é o maior!", num2);
        }

        sc.close();
    }
}
