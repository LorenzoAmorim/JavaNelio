import java.util.Scanner;

public class ex3 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      int A, B;
      System.out.println("Digite os 2 valores: ");
      A = sc.nextInt();
      B = sc.nextInt();

      if(A % B == 0 ||B % A == 0){
         System.out.println("são múltiplos");
      }else{
         System.out.println("não são múltiplos");
      }


      sc.close();
   }
}