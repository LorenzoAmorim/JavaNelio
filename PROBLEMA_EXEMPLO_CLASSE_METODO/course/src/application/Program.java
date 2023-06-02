package PROBLEMA_EXEMPLO_CLASSE_METODO.course.src.application;

import java.util.Locale;
import java.util.Scanner;

import PROBLEMA_EXEMPLO_CLASSE_METODO.course.src.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*classe "Produto" passa a se tornar a variável "product" nessa classe,
        instanciada na classe Product (new Product())*/
        Product product = new Product();
        System.out.println("ENTER PRODUCT DATAS: ");
        System.out.print("Name: ");
        /*variável "product" que puxa a classe Product, recebe um valor (sc.nextLine())
        e é guardada na variável "name" */
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //toda classe java é uma subclasse da classe Object
        /*ou seja, toda classe é um Object, e o tipo object tem algumas operações padrão
        getClass, equals, hasCode, toString*/
        //product esta definida na classe Object, por isso está disponivel todos os métodos. 
        //product.toString()

        
        System.out.println("\nProduct data: " + product + "\n");
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        //esse comando faz a atualização da quantidade dentro do objeto product
        /*product: sinalizar a subclasse product- addProducts: sinalizar o método da classe
        em que fará determinada ação- (quantity): determina o valor da variável que irá receber a ação*/
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product + "\n");
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("\nUpdate data: " + product);

        sc.close();
    }
}
