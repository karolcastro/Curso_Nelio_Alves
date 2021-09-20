package br.com.cursoNelioAlves.arquivos.exercicio.application;

import br.com.cursoNelioAlves.arquivos.exercicio.entities.Product;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String strFilePath = sc.nextLine();

        File sourceFile = new File(strFilePath);
        String sourceFolderPath = sourceFile.getParent();

        boolean success = new File(sourceFolderPath +  "//subOut").mkdir();

        String targetFile = sourceFolderPath + "//subOut//summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(strFilePath))){
            String itemCsv = bufferedReader.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = bufferedReader.readLine();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile))){
                for (Product item : list) {
                    bufferedWriter.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bufferedWriter.newLine();
                }

                System.out.println(targetFile + "CREATED!");
            }
            catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}