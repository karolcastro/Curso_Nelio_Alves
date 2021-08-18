package br.com.cursoNelioAlves.estruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor1;
        System.out.println("Informe um valor: ");
        valor1= entrada.nextInt();

        if(valor1 < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÂO NEGATIVO");
        }
    }
}