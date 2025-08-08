package Recapitulando;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int calculo;

        System.out.println("Informe um número para tabuada: ");
        int num = sc.nextInt();

        while (i <= 10) {
            calculo = num * i;
            System.out.printf("%d x %d = %d\n", num, i, calculo);
            i++;
        }
        sc.close();
    }
}
