package br.com.cursoNelioAlves.orientacaoAObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSemOrientacaoAObjetos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println(" Enter three measures  of triangle X: ");
        xA = start.nextDouble();
        xB = start.nextDouble();
        xC = start.nextDouble();

        System.out.println(" Enter three measures  of triangle Y: ");
        yA = start.nextDouble();
        yB = start.nextDouble();
        yC = start.nextDouble();

        double p = (xA + xB + xC) / 2.00;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.00;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("The lager area: X ");
        } else {
            System.out.println("The lager area: Y ");
        }
        start.close();
    }

}