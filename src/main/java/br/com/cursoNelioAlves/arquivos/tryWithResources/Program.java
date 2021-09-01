package br.com.cursoNelioAlves.arquivos.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {


        String path = ("//Users//knigosky//Downloads//_Lorem Ipsum.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader1.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader1.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
