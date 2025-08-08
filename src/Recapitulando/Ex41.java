package Recapitulando;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, (num * i));
            }
            System.out.println("Deseja continuar? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
