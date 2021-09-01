package br.com.cursoNelioAlves.arquivos.fileWritterAndBufferedWritter;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        String path = ("//Users//knigosky//Downloads//_Lorem IpsumOut.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
