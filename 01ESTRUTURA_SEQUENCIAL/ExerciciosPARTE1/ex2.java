import java.util.Locale;
import java.util.Scanner;


public class ex2 {
   public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      double r;
      double area;
      double pi = 3.14159;

         r = sc.nextDouble();

         area = pi * r * r;

         System.out.printf("A = %.4f%n", area);

      sc.close();

   }   
}
