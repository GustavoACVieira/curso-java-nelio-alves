package Section7;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = sc.nextLine();

        mostrarNome(name);

        sc.close();
    }

    public static void mostrarNome(String nome) {
        System.out.println("******");
        System.out.println("* " + nome + " *");
        System.out.println("******");
    }
}
