import java.util.Scanner;
//ESTRUTURA COM SWITCH-CASE (DEMO COM IF-ELSE)
public class main5 {
//SE NÃO USAR A SINTAXE SWITCH-CASE, USA-SE O IF-ELSE
//MODO IF ELSE:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            String dia;
            if (x == 1) {
            dia = "domingo";
            }
            else if (x == 2) {
            dia = "segunda";
            }
            else if (x == 3) {
            dia = "terca";
            }
            else if (x == 4) {
            dia = "quarta";
            }
            else if (x == 5) {
            dia = "quinta";
            }
            else if (x == 6) {
            dia = "sexta";
            }
            else if (x == 7) {
            dia = "sabado";
            }
            else {
            dia = "valor invalido";
            }
            System.out.println("Dia da semana: " + dia);
            sc.close();
    }
}
