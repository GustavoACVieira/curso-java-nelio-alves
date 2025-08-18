/*Diferença em dias entre duas datas
Peça duas datas para o usuário.
Use ChronoUnit.DAYS.between() para mostrar a quantidade de dias de diferença.*/

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a primeira data: ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), fmt1);
        System.out.println("Informe a segunda data: ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), fmt1);

        long diference = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Dias de diferença: " + diference + " dias");
        sc.close();
    }
}
