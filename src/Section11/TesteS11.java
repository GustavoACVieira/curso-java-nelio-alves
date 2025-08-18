//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html

package src.Section11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TesteS11 {
    public static void main (String[] args) {
        //Formatações
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        /// Instanciando:
        //Instanciando data hora(agora)
        System.out.println("-".repeat(20) + "Instanciando" + "-".repeat(20));
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);

        //Pengando um texto no padrão ISO 8601 e passando para data hora
        LocalDate d04 = LocalDate.parse("2025-08-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-08-20T14:02:58");
        Instant d06 = Instant.parse("2025-08-20T14:02:58Z");
        Instant d07 = Instant.parse("2025-08-20T14:02:58-03:00");

        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);

        //Pengando um texto em um formato customizado e passando para data hora
        LocalDate d08 = LocalDate.parse("20/08/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/08/2025 08:30", fmt2);
        //outra forma de formatar hora:
        //LocalDate d08 = LocalDate.parse("20/08/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        //LocalDateTime d09 = LocalDateTime.parse("20/08/2025 08:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);

        //Instanciando datas a partir de dados isolados (Ex: dia, mês, ano, [hora(opcional])
        LocalDate d10 = LocalDate.of(2025, 8, 20);
        LocalDateTime d11 = LocalDateTime.of(2025, 8, 20, 3, 33);

        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        /// Formatando:
        //Convertendo data-hora para um texto no padrão ISO 8601
        System.out.println("-".repeat(20) + "Formatando" + "-".repeat(20));
        LocalDate d12 = LocalDate.parse("2025-08-20");
        LocalDateTime d13 = LocalDateTime.parse("2025-08-20T02:33:26");
        Instant d14 = Instant.parse("2025-08-20T02:33:26Z");

        System.out.println("d12 = " + d12);
        System.out.println("d12(.format) = " + d12.format(fmt1));
        System.out.println("d13 = " + d13);
        System.out.println("d13(.format(fmt1) = " + d13.format(fmt1));
        System.out.println("d13(.format(fmt2) = " + d13.format(fmt2));
        System.out.println("d13(ISO_DATE_TIME) = " + d13.format(fmt4));
        //Instant não tem .format por isso tem que chamar pela formatação e passar o d14
        System.out.println("d14(fmt3.format(d14)) = " + fmt3.format(d14));
        System.out.println("d14(ISO_INSTANT) = " + fmt5.format(d14));
        System.out.println("d14 = " + d14);

        /// Convertendo:
        System.out.println("-".repeat(20) + "Convertendo" + "-".repeat(20));
        //Convertendo data-hora global para local
        Instant d15 = Instant.parse("2025-08-20T02:33:26Z");

        LocalDate r1 = LocalDate.ofInstant(d15, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d15, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d15, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d15, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        //obtendo dados de um horário local
        LocalDate d16 = LocalDate.parse("2025-08-20");
        LocalDateTime d17 = LocalDateTime.parse("2025-08-20T02:33:26");

        System.out.println("d16 (dia) = " + d16.getDayOfMonth());
        System.out.println("d16 (mês) = " + d16.getMonth());
        System.out.println("d16 (mês número) = " + d16.getMonthValue());
        System.out.println("d16 (ano) = " + d16.getYear());

        System.out.println("d17 (hora) = " + d17.getHour());
        System.out.println("d17 (minutos) = " + d17.getMinute());
        System.out.println("d17 (segundos) = " + d17.getSecond());

        /// Cálculos:
        System.out.println("-".repeat(20) + "Cálculos" + "-".repeat(20));
        //data hora somando ou subtraindo tempo
        LocalDate d18 = LocalDate.parse("2025-08-20");
        LocalDateTime d19 = LocalDateTime.parse("2025-08-20T02:33:26");
        Instant d20 = Instant.parse("2025-08-20T02:33:26Z");

        //LocalDate
        LocalDate pastWeekLocalDate = d18.minusDays(7);
        LocalDate nextWeekLocalDate = d18.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        //LocalDateTime
        LocalDateTime pastWeekLocalDateTime = d19.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d19.plusDays(7);
        //LocalDateTime também tem cálculos com o tempo
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        //Instant
        Instant pastWeekInstant = d20.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d20.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //Duração (2 data horas e descobre a duração entre elas)
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d18.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d19);
        Duration t3 = Duration.between(pastWeekInstant, d20);
        Duration t4 = Duration.between(d20, pastWeekInstant);

        System.out.println("t1 (dias) = " + t1.toDays());
        System.out.println("t2 (dias) = " + t2.toDays());
        System.out.println("t3 (dias) = " + t3.toDays());
        System.out.println("t4 (dias) = " + t4.toDays());
    }
}
