package Recapitulando;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.println("Informe um número(0 para sair):");
            num = sc.nextInt();
        }
        sc.close();
    }
}
