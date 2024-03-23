package ARQUIVOS.Manipulando_pastas_com_File;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // visualizar apenas diretórios/pastas
        // sintaxe de referência a métodos (reference methods)
        // função para especificar apenas pastas/diretórios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder);
        }

        // visualizar apenas arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files){
            System.out.println(file);
        }

        // Criação de diretórios/pastas
        // Instanciar o obj File, adicionar o nome do caminho(String 'strPath') e concatenar com o nome do diretório/pasta
        // e após adicionar a função '.mkdir()'
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
