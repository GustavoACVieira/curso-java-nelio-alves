package Recapitulando;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 50) {
            System.out.printf("O número %d, está entre 10 e 50", num);
        } else {
            System.out.printf("O número %d, não está entre 10 e 50", num);
        }

        sc.close();
    }
}
