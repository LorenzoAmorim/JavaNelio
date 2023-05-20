import java.util.Locale;
import java.util.Scanner;

public class ex4 {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);

      int NumFun;
      Double HourWork, ValueHour,salary;
      
      NumFun = sc.nextInt();
      HourWork = sc.nextDouble();
      ValueHour = sc.nextDouble();

      salary = HourWork * ValueHour;

      System.out.println("NUMBER = " + NumFun);
      System.out.printf("SALARY = U$ %.2f%n", salary);

      sc.close();
   }
}
