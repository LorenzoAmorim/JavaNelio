package ARQUIVOS.FileWriter_e_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa noite bruno", "FileWriter e BufferedWriter"};

        String path = "C:\\Users\\loren\\OneDrive\\Documentos\\MeusProjetosEstudo\\JavaNelio\\ARQUIVOS\\out.txt";

        // quando adicionado o argumento 'true' ele adiciona a String/frase ao final do arquivo ao invés de recriar
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
