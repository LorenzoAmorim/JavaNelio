import java.util.Scanner;
//CONTINUAÇÃO ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS
public class main4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int hora;
      System.out.println("Que horas são?");
      hora = sc.nextInt();

      if(hora<12){
         System.out.println("Bom dia!");
      //else if usados juntos, retirando as chaves do código anterior, deixando o códgio mais limpo
      }else if(hora >=12 && hora<18){
         System.out.println("Boa tarde!!");
      }else{
         System.out.println("Boa noite!");
      }

      sc.close();
   }
}
