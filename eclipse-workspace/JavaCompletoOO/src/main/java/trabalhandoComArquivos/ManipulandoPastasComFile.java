package trabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        // todas as pastas a partir de um caminho

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders");
        for(File folder : folders) {
            System.out.println(folder);
        }

        // todos os arquivos a partir de um caminho

        File[] files = path.listFiles(File::isFile);
        System.out.println("Folders");
        for(File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir1").mkdir();
        System.out.println("Diretory is created ? " + success);

        scanner.close();
    }
}

