/*Somar e subtrair dias
Peça uma data inicial.
Exiba a data 7 dias antes e 7 dias depois usando .minusDays() e .plusDays().
 */

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Opção para receber no padrão ISO 8601 ou não
        System.out.println("De que modo deseja informar a data:\n1 - ISO 8601\n2 - Normal");
        int opcao = sc.nextInt();
        sc.nextLine();
        LocalDate initialDay;

        if (opcao == 1) {
            System.out.print("Escreva uma data inicial: ");
            initialDay = LocalDate.parse(sc.nextLine());
        } else {
            System.out.print("Escreva uma data inicial: ");
            initialDay = LocalDate.parse(sc.nextLine(), fmt1);
        }

        //Print
        System.out.println("Padrão ISO 8601: ");
        System.out.println("Data 7 dias antes: " + initialDay.minusDays(7));
        System.out.println("-".repeat(20));
        System.out.println("Data 7 dias depois: " + initialDay.plusDays(7));

        System.out.println("-".repeat(20));

        System.out.println("Data normal: ");
        System.out.println("Data 7 dias antes: " + initialDay.minusDays(7).format(fmt1));
        System.out.println("-".repeat(20));
        System.out.println("Data 7 dias depois: " + initialDay.plusDays(7).format(fmt1));

        sc.close();
    }
}
