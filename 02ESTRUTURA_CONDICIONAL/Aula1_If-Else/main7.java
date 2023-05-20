import java.util.Scanner;
/*EXPRESSÃO CONDICIONAL TERNÁRIA - ESTRUTURA OPCIONAL AO IF-ELSE QUANDO SE DESEJA
    DECIDIR UM VALOR COM BASE EM UMA CONDIÇÃO*/
public class main7 {
    //IF-ELSE APLICADO
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        
        double preco = 34.5;
        double desconto;

        if (preco < 20.0){
            desconto = preco * 0.1;
        }else{
            desconto = preco * 0.5;
        }

        System.out.println(desconto);

        sc.close();
    }
}
