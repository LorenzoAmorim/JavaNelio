import java.util.Scanner;
public class main4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      char x;
      x = sc.next().charAt(0);
      System.out.println("Você digitou: " + x);

      sc.close();
   }
}
