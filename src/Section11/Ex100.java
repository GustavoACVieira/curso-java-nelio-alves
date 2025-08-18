/*Mostrar partes da data
Peça uma data e exiba:
Dia do mês
Dia da semana (getDayOfWeek())
Mês por extenso (getMonth())
Ano*/

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma data: ");
        LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Dia do mês: " + date.getDayOfMonth());
        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Dia do ano: " + date.getDayOfYear());
        System.out.println("Mês por extenso: " + date.getMonth());
        System.out.println("Mês: " + date.getMonthValue());
        System.out.println("Ano: " + date.getYear());
        sc.close();
    }
}
