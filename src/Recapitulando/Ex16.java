package Recapitulando;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.print("Ano bissexto!");
        } else {
            System.out.print("Ano não bissexto!");
        }

        sc.close();
    }
}
