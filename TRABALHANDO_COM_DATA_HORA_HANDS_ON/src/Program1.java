package TRABALHANDO_COM_DATA_HORA_HANDS_ON.src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {
    public static void main(String[] args) {
        //TIPOS DE DATA-HORA:
        //".now" sinaliza o horário atual de acordo com a sua máquina
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //gera o date time no timezone "GMT" (3 horas a mais) com o "Z" time no final
        Instant d03 = Instant.now();

        //"parse" formata a data no modo ISO 8601(yy-mm-dd) para data-hora
        LocalDate d04 = LocalDate.parse("2023-10-26");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-26T01:30:26");
        Instant d06 = Instant.parse("2023-10-26T01:30:26Z");

        //"DateTimeFormatter" formata a data em dia/mes/ano(dd/MM/yyyy).
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //horas e minutos (HH:mm)
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
    }
}
