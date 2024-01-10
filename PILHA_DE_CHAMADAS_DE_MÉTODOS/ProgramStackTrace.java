package PILHA_DE_CHAMADAS_DE_MÉTODOS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramStackTrace {

    public static void main(String[] args) {
        method1();
        System.out.println("End of program");
    }
    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }
    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            // função 'printStackTrace() serve para mostrar o tipo de exceção que ocorreu no programa.
            // com essa função, não significa que o programa finalizou, apenas mostra a exceção, como
            // se não houvesse nenhum try-catch
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}

