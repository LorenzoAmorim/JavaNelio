package EXERCICIOS_VETORES;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        //vetor "number" que recebe um número inteiro(int) definido com a variável "n"
        int[] number = new int[n];

        //loop definido para fazer uma entrada de um número a quantidade de vezes em que a variável "n" foi definida
        for(int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            number[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        // define e mostra na tela os números negativos que aparecem no loop acima.
        for(int i = 0; i<n; i++){
            if(number[i]<0){
                System.out.printf("%d \n", number[i]);
            }
        }

        sc.close();
    }
}
