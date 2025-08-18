/*Converter Instant para horário local
Obtenha o horário atual como Instant.now().
Converta para LocalDateTime usando o fuso horário padrão do sistema.
 */

package src.Section11;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex96 {
    public static void main(String[] args) {
        System.out.println("Horário Instant.now: " + Instant.now());
        System.out.println("-".repeat(20));
        System.out.println("Horário LocalDateTime: " + LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
    }
}
