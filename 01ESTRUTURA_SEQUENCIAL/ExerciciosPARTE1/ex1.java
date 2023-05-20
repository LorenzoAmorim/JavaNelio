import java.util.Scanner;

public class ex1 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner (System.in);

      int A,B,soma1;

      A = sc.nextInt();
      B = sc.nextInt();
      soma1 = A + B;

      System.out.println("A soma desses 2 valores são iguais a: " + soma1);

      sc.close();
   }
}
