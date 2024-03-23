package ARQUIVOS.Classe_File_e_Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // instanciamos o objeto 'File' com o caminho(path) do arquivos que queremos ler/usar
        File file = new File("C:\\Users\\loren\\OneDrive\\Documentos\\MeusProjetosEstudo\\JavaNelio\\ARQUIVOS\\in.txt");
        Scanner sc = null;
        // quando instanciamos o scanner o programa tentará abrir o arquivo, o que pode gerar uma exceção 'IOException',
        // nos obrigando a fazer o bloco try catch.
        try{
            sc = new Scanner(file);
            // testamos se há uma nova linha no arquivo
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // bloco finally adicionado para que o Scanner feche independente se o try ou catch falharem
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
