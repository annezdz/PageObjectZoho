package trabalhandoComArquivos.exercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //lendo o arquivo com os dados dos produtos em tela
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\anicolle\\eclipse-workspace\\doc.csv";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                list.add(new Product(name,price,quantity));
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Error : " + exception.getMessage());
        }

        // criando uma pasta, caso ela não exista

        String strPath = "C:\\Users\\anicolle\\eclipse-workspace";

        File pathAll = new File(strPath);

        File[] folders = pathAll.listFiles(File::isDirectory);

        for (File folder : folders) {
            if (!folder.getName().equals("out")) {
                boolean newFolder = new File(strPath + "\\out").mkdir();
            }
        }

        // criando o arquivo summary.csv, caso ele não exista

        String finalPath = strPath + "\\out";
        File[] files = pathAll.listFiles(File::isFile);
        for(File file : files) {
            if(!file.getName().equals("summary")) {
                try {
                    boolean newFile = new File(finalPath + "\\summary.csv").createNewFile();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // inserindo dados no arquivo summary.csv

        String targetFile = "C:\\Users\\anicolle\\eclipse-workspace\\out\\summary.csv";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile))) {
            for(Product item : list) {
                bufferedWriter.write(item.getName() + "," + String.format("%.2f%n", item.total()));
            }
            System.out.println(targetFile + " CREATED !");
        } catch (IOException e) {
            System.out.println("Error writing file " + e.getMessage());
        }
        scanner.close();
    }
}