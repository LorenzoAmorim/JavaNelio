package ARQUIVOS.Informacoes_do_caminho_do_arquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");

        String strPath = sc.nextLine();
        File path = new File(strPath);

        // função 'getName' busca o nome do arquivo pelo caminho 'path'
        System.out.println("getName: " + path.getName());

        // função 'getParent' busca o nome do diretório onde contém o arquivo, pelo caminho 'path'
        System.out.println("getParent: " + path.getParent());

        // função 'getPath' busca o nome do caminho completo do arquivo pelo caminho 'path'
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
