package Section7;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int numeroMultiplicado = multiplicarPor2(num);
        System.out.println(numeroMultiplicado);

        sc.close();
    }

    public static int multiplicarPor2(int n) {
        return n << 1;
    }
}
