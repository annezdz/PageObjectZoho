package trabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[] { "Good Good","Goor Bad","Good nery bad"};

        String path = "C:\\Users\\anicolle\\eclipse-workspace\\in.txt";

        // se colocar true, ele escreve abaixo, se não colocar, ele apaga tudo o que tinha anteriormente

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))) {
            for(String line : lines) {
                writer.write(line);
                writer.newLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
