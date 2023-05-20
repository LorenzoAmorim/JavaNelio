import java.util.Locale;
import java.util.Scanner;

public class ex5 {
   public static void main(String[] args) {
      
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      //cod1 e cod2 não foram usados
      int cod1,num1,cod2,num2;
      double v1, v2, value;

       cod1 = sc.nextInt();
       num1 = sc.nextInt();
       v1 = sc.nextDouble();

       cod2 = sc.nextInt();
       num2 = sc.nextInt();
       v2 = sc.nextDouble();

       value = v1 * num1 + v2 * num2;

      System.out.println("VALOR A PAGAR: R$" + value);

      sc.close();
   }
}
