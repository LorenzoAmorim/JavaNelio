import java.util.Scanner;
//PROGRAMA COM O SWITCH-CASE
public class main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        String dia;

        switch(x){
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Valor inválido";
            break;
        }
            System.out.println("Qual o dia da semana? \n" + dia);
        sc.close();
    }
}

// SINTAXE DO PROGRAMA

/*switch ( expressão ) {
    case valor1:
        comando1;
        comando2;
        break;
    case valor2:
        comando3;
        comando4;
        break;
    default:
        comando5;
        comando6;
        break;
    } */