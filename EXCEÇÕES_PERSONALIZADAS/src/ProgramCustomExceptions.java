package EXCEÇÕES_PERSONALIZADAS.src;

import EXCEÇÕES_PERSONALIZADAS.model.entities.Reservation;
import EXCEÇÕES_PERSONALIZADAS.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramCustomExceptions {

    public static void main(String[] args){
        // SOLUÇÃO 3 - BOA

        Scanner sc = new Scanner(System.in);
        // função usada para definir o formato da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            // método 'parse' usado para converter a variável 'Date' em uma data
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        // No primeiro 'catch' pega o erro do 'ParseException', ou seja, da entrada do valor da data
        // de reserva, onde no 'parse' pode haver um possível erro.
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        // No segundo 'catch' ele pega o erro do 'DomainException', ou seja, da atualização da data da reserva
        // onde criamos uma classe para o 'DomainException' para passar mensagens personalizadas da classe 'Reservation'
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        // outro 'catch' para capturar qualquer outra exceção que seja
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }



        sc.close();
    }
}
