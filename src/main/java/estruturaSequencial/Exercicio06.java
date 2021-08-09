package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double valorA, valorB, valorC, triangulo, circulo, trapezio, quadrado, retangulo;

        valorA = entrada.nextFloat();
        valorB = entrada.nextFloat();
        valorC = entrada.nextFloat();


        triangulo = valorA * valorC / 2.0;
        circulo = 3.14159 * valorC * valorC;
        trapezio = (valorA + valorB) / 2.0 * valorC;
        quadrado = valorB * valorB;
        retangulo = valorA * valorB;

        System.out.printf("Triangulo = %.3f%n", triangulo);
        System.out.printf("Circulo = %.3f%n", circulo);
        System.out.printf("Trapezio = %.3f%n", trapezio);
        System.out.printf("Quadrado = %.3f%n", quadrado);
        System.out.printf("Retangulo = %.3f%n", retangulo);


        entrada.close();

    }
}
