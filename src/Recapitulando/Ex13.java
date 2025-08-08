package Recapitulando;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um dígito: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("É par!");
        } else {
            System.out.print("É impar!");
        }

        sc.close();
    }
}
