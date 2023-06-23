package EXERCICIO_MEMBROS_ESTATICOS.fixExercicies.src;

import java.util.Locale;
import java.util.Scanner;

import EXERCICIO_MEMBROS_ESTATICOS.fixExercicies.src.util.CurrencyConverter;

public class program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.printf("Whats is the dollar price?");
        double dollarPrice = sc.nextDouble();
        
        System.out.printf("How many dollars will be bought?");
        converter.manyDollarsbought = sc.nextDouble();
    

        System.out.println("Amount to be paid in reais = " + converter.ValueToPay(dollarPrice));
        

        sc.close();
    }
}
