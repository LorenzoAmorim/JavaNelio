package CONTRUTORES.course.src.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //O Construtor é geralmente colocado após os atributos e antes dos métodos.
    /*O Construtor é o que se executa no momento da instanciação do objeto, na classe Program.*/
    /*Abaixo será criado um construtor que obrigará a fornecer o nome, o preço e a quantidade no momento da instanciação.*/
    //é formado apenas pelo membro "public" e o nome da classe.
    public Product (String name, double price, int quantity){
        this.name= name;//A palavra "this" quer dizer que é uma referência à palavra do próprio atributo do objeto da classe.
        this.price = price;/*O "this.price" refere-se ao atributo do objeto da classe, já o segundo "price" refere-se ao parâmetro do
        método.*/
        this.quantity = quantity;
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
