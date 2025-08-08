package Recapitulando;
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0;
        do {
            num = sc.nextInt();
            soma += num;
        } while (num != 0);

        System.out.println(soma);

        sc.close();
    }
}
