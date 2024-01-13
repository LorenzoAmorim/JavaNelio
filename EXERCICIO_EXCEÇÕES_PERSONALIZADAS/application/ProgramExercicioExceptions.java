package EXERCICIO_EXCEÇÕES_PERSONALIZADAS.src;

import EXERCICIO_EXCEÇÕES_PERSONALIZADAS.model.entities.Account;
import EXERCICIO_EXCEÇÕES_PERSONALIZADAS.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicioExceptions {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");

        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.next();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withDrawLimit = sc.nextDouble();
        System.out.println();

        Account account = new Account (number, holder, balance, withDrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
        catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
