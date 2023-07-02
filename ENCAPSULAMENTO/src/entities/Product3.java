package ENCAPSULAMENTO.src.entities;

public class Product3 {
    private String name;
    private double price;
    private int quantity;

    
   
    public Product3 (String name, double price, int quantity){
        this.name= name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product3 (String name, double price){
        this.name= name;
        this.price = price;
    }

    public Product3(){
    }

    //Os métodos get e set são normalmente adicionados após os construtores
    public String getName(){
        return name;
    }

    //método set, define ou altera o atributo. set = "definir", "alterar"
    public void setName(String name){//é "void" pois não retorna nenhum valor. 
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    /*O atributo quantity só pode ser chamado pelo método "get", pois a quantidade do
    produto só pode ser mudada pelos métodos "addProducts" e "removeProducts", então
    se adicionasse o método "set" o atributo "quantity" se tornaria um estado inconsistente */
    public double getQuantity(){
        return quantity;
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

