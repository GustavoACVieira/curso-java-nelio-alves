/*Calcular dias até o aniversário
Peça a data de aniversário do usuário.
Calcule quantos dias faltam até o próximo aniversário (considerando se já passou no ano atual).*/

package src.Section11;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe seu aniversário: ");
        LocalDate birthdayOriginal = LocalDate.parse(sc.nextLine(), fmt1);
        LocalDate dateNow = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
        LocalDate nextBirthday = birthdayOriginal.withYear(dateNow.getYear());

        //se já passou, coloca para o próximo ano
        if (nextBirthday.isBefore(dateNow) || nextBirthday.isEqual(dateNow)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        //compara os dias da data atual com a do proximo aniversário
        long daysToBirthday = ChronoUnit.DAYS.between(dateNow, nextBirthday);

        System.out.println("Dias até o próximo aniversário: " + daysToBirthday);
        sc.close();
    }
}
