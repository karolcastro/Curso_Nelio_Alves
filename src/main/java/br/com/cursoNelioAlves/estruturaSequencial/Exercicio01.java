package br.com.cursoNelioAlves.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int soma = valor1+valor2;

        System.out.println("Soma = " +soma);

    }
}