package ESTRUTURA_TRY_CATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // é adicionado o 'try' no programa onde pode ocorrer um possível erro de exceção
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        // é adicionado o 'catch' contendo como parâmetro o possível erro a ser mostrado no console
        catch(InputMismatchException e){
            System.out.println("Input error!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }


        System.out.println("End of program!");
        sc.close();
    }
}