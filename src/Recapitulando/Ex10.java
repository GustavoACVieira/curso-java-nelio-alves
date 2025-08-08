package Recapitulando;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        System.out.printf("Antecessor: %d\nSucessor: %d", num - 1, num + 1);

        sc.close();
    }
}
