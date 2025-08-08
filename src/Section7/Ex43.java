package Section7;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = somar(num1, num2);
        imprimir(resultado);

        sc.close();
    }

    public static int somar(int n1, int n2) {
        int aux = n1 + n2;
        return aux;
    }

    public static void imprimir(int result) {
        System.out.println("Resultado da soma: " + result);
    }
}
