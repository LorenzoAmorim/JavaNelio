import java.util.Scanner;

public class main8 {
//CONDIÇÃO TERNÁRIA APLICADA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20)? preco * 0.1 : preco * 0.5;

        System.out.println(desconto);
        sc.close();
    }
}

/*Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso

Exemplos:
( 2 > 4 ) ? 50 : 80 -> 80
( 10 != 3 ) ? "Maria" : "Alex" -> "Maria"
*/