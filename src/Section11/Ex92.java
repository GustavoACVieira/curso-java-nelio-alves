/* Criar e formatar uma data
Peça para o usuário digitar uma data no formato dd/MM/yyyy.
Converta para LocalDate e exiba no formato ISO (yyyy-MM-dd).*/

package src.Section11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //declarando a data no formata dd/MM/yyyy
        System.out.print("Informe a data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt1);

        System.out.println("Data padrão ISO 8601: " + date);
        sc.close();
    }
}
