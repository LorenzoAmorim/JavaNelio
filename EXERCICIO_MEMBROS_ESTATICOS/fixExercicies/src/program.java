package EXERCICIO_MEMBROS_ESTATICOS.fixExercicies.src;

import java.util.Locale;
import java.util.Scanner;

import EXERCICIO_MEMBROS_ESTATICOS.fixExercicies.src.util.CurrencyConverter;

public class program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*não é necessário instanciar a subclasse "CurrencyConverter" porque o método "ValueToPay" é estático 
        Portanto, você pode acessá-lo diretamente usando o nome da classe, sem precisar criar um objeto.
        */
        System.out.printf("Whats is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.printf("How many dollars will be bought?");
        double manyDollarsbought = sc.nextDouble();
    
        /*Em "double result = CurrencyConverter.ValueToPay(manyDollarsbought, dollarPrice)" foi necessário colocar as variáveis
        entre parênteses pois elas são os parâmetros do método "ValueToPay", representam o valor em dólares que será comprado e 
        o preço do dolár em reais */
        double result = CurrencyConverter.ValueToPay(manyDollarsbought, dollarPrice);
        System.out.println("Amount to be paid in reais = " + result);
        

        sc.close();
    }
}
