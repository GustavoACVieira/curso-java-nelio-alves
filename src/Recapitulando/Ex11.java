package Recapitulando;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INforme um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("Seu número é positivo!");
        } else if (num < 0) {
            System.out.print("Seu número é negativo!");
        } else {
            System.out.print("Seu número é igual à 0!");
        }

        sc.close();
    }
}
