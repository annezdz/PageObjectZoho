package trabalhandoComArquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoExemplo {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\anicolle\\eclipse-workspace\\in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}
