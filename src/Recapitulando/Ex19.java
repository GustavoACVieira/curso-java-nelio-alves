package Recapitulando;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Informe a nota: ");
     int n1 = sc.nextInt();

     if (n1 >= 6) {
         System.out.print("APROVADO!");
     } else {
         System.out.print("REPROVADO!");
     }

     sc.close();
    }
}
