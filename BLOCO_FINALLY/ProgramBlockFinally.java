package BLOCO_FINALLY;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramBlockFinally {

    public static void main(String[] args) {

        // Programa que executa um arquivo do tipo txt e mostra o texto existente no console.
        // Se não existir, o método catch é chamado.
        // O método finally, é chamado independente se existir ou não um arquivo txt, pois a função 'Scanner'
        // tem que ser finalizada.
        File file = new File("C:\\Users\\loren\\OneDrive\\Área de Trabalho\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        // método 'finally' para que a função 'Scanner' seja finalizada/fechada.
        finally {
            if (sc != null) {
                sc.close();
            }
        }
        System.out.println("Finally block executed");
    }
}
