package Section7;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para tabuada: ");
        int num = sc.nextInt();

        tabuada(num);
        sc.close();
    }

    public static void tabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }
}
