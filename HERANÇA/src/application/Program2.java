package HERANÇA.src.application;

import HERANÇA.src.entities.Account;
import HERANÇA.src.entities.BusinessAccount;
import HERANÇA.src.entities.SavingsAccount;

public class Program2 {
    public static void main(String[] args) {

        // teste do método 'witdraw' normal na conta 'Account'
        Account acc1 = new Account(01, "Jorje", 100.0);
        acc1.withdraw(20);
        System.out.println(acc1.getBalance());

        // teste do método 'witdraw' sem desconto na conta 'SavingsAccount'
        Account acc2 = new SavingsAccount(02, "Maiko", 100.0, 0.1);
        acc2.withdraw(20);
        System.out.println(acc2.getBalance());

        // teste do método 'witdraw' com desconto de 2.0 na conta 'BusinessAccount'
        Account acc3 = new BusinessAccount(03, "Ronaldi", 100.0, 500.0);
        acc3.withdraw(20);
        System.out.println(acc3.getBalance());
    }
}
