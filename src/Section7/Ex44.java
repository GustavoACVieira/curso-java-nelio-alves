package Section7;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int resultado = fatorial(num);
        imprimirFat(resultado);

        sc.close();
    }

    public static int fatorial(int fat) {
        int aux = 1;
        for (int i = 1; i <= fat; i++) {
            aux *= i;
        }
        return aux;
    }

    public static void imprimirFat (int resultFat) {
        System.out.println("O fatorial deste número é: " + resultFat);
    }
}
