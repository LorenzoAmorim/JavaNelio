package EXERCICIOS_SOBRECARGA_ENCAPSULAMENTO.course.src;

import java.util.Locale;
import java.util.Scanner;

import EXERCICIOS_SOBRECARGA_ENCAPSULAMENTO.course.entities.Account;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");

        //"sc.next().charAt(0)" serve para ler apenas 1 caractere (y ou n)
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account (number, holder, initialDeposit);
        }else{
            acc = new Account(number, holder);
        }

        System.out.println();
        System.out.print("Account data: \n");
        System.out.print(acc + "\n");

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);
        System.out.print("Updated account data: \n");
        System.out.print(acc + "\n");

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);
        System.out.print("Updated account data: \n");
        System.out.print(acc);

        sc.close();
    }
}
