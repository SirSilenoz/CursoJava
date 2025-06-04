package ExercicioFiles.application;

import ExercicioFiles.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine(); // salva o caminho da pasta de origem

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent(); // pega o caminho da pasta de origem

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); //cria uma subpasta "out" na pasta de origem

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { //leitura do arquivo csv
            String itemCsv = br.readLine();

            while (itemCsv != null) {

                String[] fields = itemCsv.split(","); //separa os dados do arquivo pela ","
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity)); //cria um produto e adiciona a lista

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) { // cria o arquivo "summary.csv" na subpasta "out"

                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                } // salva cada produto da lista no arquivo summary.csv

                System.out.println(targetFileStr + " CREATED");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());

            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}