package ENCAPSULAMENTO.src;

import java.util.Locale;
import java.util.Scanner;

import ENCAPSULAMENTO.src.entities.Product3;


public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product3 product = new Product3(name, price);

        /*Aqui foi definido que o nome do produto agora se chama "computer", através do método
        set.Name*/
        product.setName("computer");
        /*aqui obtem o valor do atributo na tela através do nome do objeto "product" e o método
        "getName" que é o método obter */
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
