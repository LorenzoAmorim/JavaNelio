package CONVERTENDO_DATA_HORA_LOCAL_PARA_GLOBAL.src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-10-28");
        LocalDateTime d02 = LocalDateTime.parse("2023-10-28T16:04:30");
        Instant d03 = Instant.parse("2023-10-28T16:05:30Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
    }
}
