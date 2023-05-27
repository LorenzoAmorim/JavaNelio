import java.util.Locale;
import java.util.Scanner;

public class dowhile1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        //OBS: FUNÇÃO SEM O "DO" APENAS COM O WHILE
        char resp = 's';

        /* ENQUANTO resp NÃO FOR n, DIGITE A TEMPERATURA..., APÓS DIGITAR A TEMPERATURA
            A FÓRMULA SERÁ REALIZADA, APÓS IRÁ MOSTRAR CONVERTIDA EM FAHRENHEIT
            E APÓS IRÁ PERGUNTAR SE DESEJA REPETIR, E O ÚLTIMO COMANDO SERA:
            resp RECEBE O SCANNER sc.next() QUE RECEBE O PRIMEIRO CARACTERE .charAt(0) 
            DE resp QUE SERA O 'n'*/
        while(resp != 'n'){
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
            System.out.print("Deseja repetir? (s/n)?");
            resp = sc.next().charAt(0);
        }

        sc.close();
    }
}
