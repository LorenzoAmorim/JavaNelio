package HERANÇA.src.application;

import HERANÇA.src.entities.Account;
import HERANÇA.src.entities.BusinessAccount;
import HERANÇA.src.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        // Conversão da subclasse para a superclasse

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        // Conversão da superclasse para a subclasse

        BusinessAccount acc4 = (BusinessAccount) acc2; // necessário fazer a conversão manual para o downcasting
        // não é possível fazer a operação 'loan' antes de fazer o downcasting
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; // repare que o 'acc3' é a classe 'SavingsAccount', então mostrará erro na execução.

        // condição abaixo verifica se o 'acc3' é uma instancia de 'BusinessAccount' ou 'SavingsAccount', cria um desses objetos novos
        // aplica uma operação específica desses objetos e mostra uma mensagem
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
