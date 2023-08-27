package EXERCICIOS_SOBRECARGA_ENCAPSULAMENTO.course.entities;

public class Account {
    
    //se os atributos são privados, teremos que criar os get e set de cada atributo
    private int number; //número da cont
    private String holder; // titular da conta
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //construtor executado na instanciação da classe principal, para receber valores e ser alocados à essa classe
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    //apenas get no atributo number, pois o número da conta é único e não pode ser mudado
    public int getNumber() {
        return number;
    }

    //get e set no titular (holder) pois vamos selecionar (get) e é possivel o titular trocar/definir o nome (set)
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    //apenas get no saldo(Balance) pois só é possivel mudar o valor se for adicionado por depósito ou saque
    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        balance += amount;

    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    //O método toString serve para gerar uma representação textual de um objeto.
    public String toString(){
        return "Account "
        + number
        + ", Holder "
        + holder
        + " , Balance: $"
        + String.format("%.2f \n", balance);
    }

}
