/*Contagem regressiva para um evento
Peça a data de um evento.
Mostre a diferença em anos, meses e dias até ele usando ChronoUnit.*/

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Ex101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a data do evento: ");
        LocalDate eventDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        long totalDays = ChronoUnit.DAYS.between(LocalDate.now(), eventDate);
        long totalMonths = ChronoUnit.MONTHS.between(LocalDate.now(), eventDate);
        long totalYears = ChronoUnit.YEARS.between(LocalDate.now(), eventDate);

        System.out.println("Diferença em anos totais: " + totalYears);
        System.out.println("Diferença em meses totais: " + totalMonths);
        System.out.println("Diferença em dias totais: " + totalDays);
        sc.close();
    }
}
