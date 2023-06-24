package EXERCICIO_MEMBROS_ESTATICOS.fixExercicies.src.util;

public class CurrencyConverter {
    
    public static double IOF  = 0.06;

    public static double ValueToPay(double manyDollarsbought, double dollarPrice){
        return dollarPrice * manyDollarsbought * (1.0 + IOF);
    }


}

