package SOBRECARGA.src.entities;

public class Product2 {
    public String name;
    public double price;
    public int quantity;

   
    public Product2 (String name, double price, int quantity){
        this.name= name;
        this.price = price;
        this.quantity = quantity;
    }

    //Construtor de sobrecarga personalizado
    public Product2 (String name, double price){
        this.name= name;
        this.price = price;
        //this.quantity = 0; //Atributo quantity opcional, pode-se colocar: "quantity = 0" apenas, ou nada.
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}

