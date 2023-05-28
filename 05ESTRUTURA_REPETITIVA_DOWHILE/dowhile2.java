import java.util.Locale;
import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //PROGRAMA COM O 'DO-WHILE'
        /*AQUI O CHAR É CHAMADO FORA DOS COMANDOS POIS SE 
        FOR CHAMADO DENTRO, TERÁ DE CHAMÁ-LO MAIS DE UMA VEZ, 
        ASSIM ECONOMIZANDO LINHA*/
        char resp;
        do {/*FAÇA- LER A TEMPERATURA EM CELSIUS, INSERIR O VALOR DE 'C'
            DEFINIR A FÓRMULA DE F,*/
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (9*C/5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseha repetir? (s/n): ");
            resp = sc.next().charAt(0);
        } while(resp != 'n');//OU "while(resp =='s')"

        sc.close();
    }
}
