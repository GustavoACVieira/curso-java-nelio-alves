package Recapitulando;
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;
        do {
            senha = sc.nextLine();
        } while (!senha.equals("java123"));
        System.out.println("Acesso permitido!");

        sc.close();
    }
}
