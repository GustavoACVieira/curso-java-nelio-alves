package Recapitulando;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPar = 1;

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        while (num != -1) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                countPar++;
            }
        }
        System.out.println("Numeros pares digitados: " + countPar);
        sc.close();
    }
}
