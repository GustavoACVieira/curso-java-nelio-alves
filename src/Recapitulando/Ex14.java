package Recapitulando;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.print("São iguais!");
        } else {
            System.out.print("São diferentes!");
        }

        sc.close();
    }
}
