import java.util.Scanner;

public class ex2 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int x;
      System.out.println("digite um número:");
      x = sc.nextInt();

      //se o resto da divisão de um número por 2 for igual a 0, ele é par
      if(x % 2 == 0 ){
         System.out.println("PAR");
      }else{
         System.out.println("IMPAR");
      }

      sc.close();
   }
}
