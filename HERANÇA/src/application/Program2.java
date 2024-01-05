package HERANÇA.src.application;

import HERANÇA.src.entities.Account;
import HERANÇA.src.entities.SavingsAccount;

public class Program2 {
    public static void main(String[] args) {
        Account acc1 = new Account(01, "Jorje", 100.0);
        acc1.withdraw(20);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(02, "Maiko", 100.0, 0.1);
        acc2.withdraw(20);
        System.out.println(acc2.getBalance());
    }
}
