package br.com.cursoNelioAlves.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);

    double x, y;

    System.out.println("Informe o valor de X: ");
    x = entrada.nextDouble();

    System.out.println("Informe o valor de Y: ");
    y = entrada.nextDouble();

    if( x == 0.0 && y == 0.0) {
        System.out.println("Origem");
    } else if (x > 0.0 && y > 0.0) {
        System.out.println("Q1");
    } else if (x < 0.0 && y > 0.0) {
        System.out.println("Q2");
    } else if (x < 0.0 && y < 0.0) {
        System.out.println("Q3");
    } else {
        System.out.println("Q4");
    }
        entrada.close();
}
}