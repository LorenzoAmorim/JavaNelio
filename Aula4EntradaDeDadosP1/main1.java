
import java.util.Scanner;
public class main1 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      String x;
      x = sc.next();
      //Para ler uma palavra (texto sem espaços)
      System.out.println("Você digitou: " + x);
      
      sc.close();
   }
}
