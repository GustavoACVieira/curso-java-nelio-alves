package Recapitulando;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a operação que deseja fazer:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int operacao = sc.nextInt();
        System.out.println("Informe o primeiro número da operação: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número da operação: ");
        int num2 = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.printf("Resultado: %.2f", ((double)num1 / num2));
                break;
            default:
                System.out.println("Operação indisponível! ERROR 400");
                break;
        }
        sc.close();
    }
}
