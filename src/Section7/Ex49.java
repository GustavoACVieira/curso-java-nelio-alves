package Section7;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int year = sc.nextInt();

        if (ehBissexto(year)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto");
        }
        sc.close();
    }

    public static boolean ehBissexto(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
