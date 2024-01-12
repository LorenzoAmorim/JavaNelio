package EXCEÇÕES_PERSONALIZADAS.src;

import EXCEÇÕES_PERSONALIZADAS.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramCustomExceptions {

    public static void main(String[] args) throws ParseException {
        // SOLUÇÃO 2 - RUIM

        Scanner sc = new Scanner(System.in);
        // função usada para definir o formato da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        // método 'parse' usado para converter a variável 'Date' em uma data
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            // condição para erro 'error' instanciada da classe 'Reservation' e adicionada lógica para aparecer mensagem
            // do erro
            String error = reservation.updateDates(checkIn, checkOut);
            if(error != null){
                System.out.println("Error in reservation: " + error);
            }
            System.out.println("Reservation: " + reservation);
        }
        sc.close();
    }
}
