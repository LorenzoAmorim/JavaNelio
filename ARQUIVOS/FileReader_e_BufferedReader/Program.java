package ARQUIVOS.FileReader_e_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        // 'FileReader' é usado para ler caracteres de um arquivo de texto
        // 'BufferedReader' armazena dados temporariamente em memória antes de serem lidos pelo programa. (mais rápido)
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

