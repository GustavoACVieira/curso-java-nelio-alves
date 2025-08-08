package Recapitulando;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma vogal: ");
        String vogal = sc.nextLine();

        switch (vogal) {
            case "A":
                System.out.println("Vogal: A");
                break;
            case "E":
                System.out.println("Vogal: E");
                break;
            case "I":
                System.out.println("Vogal: I");
                break;
            case "O":
                System.out.println("Vogal: O");
                break;
            case "U":
                System.out.println("Vogal: U");
                break;
            default:
                System.out.println("Não é vogal!");
                break;
        }
        sc.close();
    }
}
