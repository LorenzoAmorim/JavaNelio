package EXERCICIOS_VETORES;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos número você vai digitar? ");
        n = sc.nextInt();

        //armazenar a quantidade de "n" em uma variável "number" de vetor
        double[]number = new double[n];

        //para o valor de "n" aparecerá um campo para digitar um número
        for(int i =0; i<n; i++){
            System.out.print("Digite um número: ");
            number [i] = sc.nextDouble();
        }

        //variável soma definida como 0
        soma = 0;

        //para cada valor no loop acima, esse valor será somado à variável "soma"
        for(int i = 0; i<n; i++){
            soma = soma + number[i];
        }

        //variável "media" definida com o valor da soma dividido pelo número definido na variável "n"
        media = soma/n;


        System.out.print("VALORES: ");

        //loop iniciado para aparecer os valores de "n" pela mensagem acima
        for(int i = 0; i<n; i++){
            System.out.printf("%.1f ", number[i]);
        }

        //mensagens para mostrar os valores da soma e da média dos números
        System.out.printf("\nSOMA: %.2f", soma);
        System.out.printf("\nMEDIA: %.2f", media);

        sc.close();
    }
}