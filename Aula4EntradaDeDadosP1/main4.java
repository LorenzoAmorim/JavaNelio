import java.util.Scanner;
public class main4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Para ler um caractere
      char x;
      //charAt(0): define o primeiro caractere da palavra
      x = sc.next().charAt(0);
      System.out.println("Você digitou: " + x);

      sc.close();
   }
}
