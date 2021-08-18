package br.com.cursoNelioAlves.estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int x, y;

        System.out.println("Digite uma coordenada para X: ");
        x = entrada.nextInt();

        System.out.println("Digite uma coordenada para Y: ");
        y = entrada.nextInt();

        while (x != 0 && y != 0) {
            if(x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if(x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if(x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            x = entrada.nextInt();
            y = entrada.nextInt();

        }
        entrada.close();
    }
}