package orientacaoAObjetos.exercicioComOrientacaoAObjetos.triangle.application;

import orientacaoAObjetos.exercicioComOrientacaoAObjetos.triangle.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioComOrientacaoAObjetos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);
        Triangle x, y;
        y = new Triangle();
        x = new Triangle();

        System.out.println(" Enter three measures  of triangle X: ");
        x.a = start.nextDouble();
        x.b = start.nextDouble();
        x.c = start.nextDouble();

        System.out.println(" Enter three measures  of triangle Y: ");
        y.a = start.nextDouble();
        y.b = start.nextDouble();
        y.c = start.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

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