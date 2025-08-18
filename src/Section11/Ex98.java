/*Formatar em diferentes padrões
Peça uma data no formato ISO (yyyy-MM-dd).
Exiba em 3 formatos diferentes (dd/MM/yyyy, MMM dd, yyyy, EEEE dd/MM/yyyy). */

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");

        System.out.println("Informe uma data no padrão ISO 8601: ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.println("Data formatada (fmt1): " + date.format(fmt1));
        System.out.println("Data formatada (fmt2): " + date.format(fmt2));
        System.out.println("Data formatada (fmt3): " + date.format(fmt3));
        sc.close();
    }
}
