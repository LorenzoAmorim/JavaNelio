import java.util.Scanner;
public class ex1 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int x;
      System.out.println("Digite um número:");
      x = sc.nextInt();

      if(x<0){
         System.out.println("NEGATIVO");
      }else{
         System.out.println("POSITIVO");
      }

      sc.close();
   }
}
