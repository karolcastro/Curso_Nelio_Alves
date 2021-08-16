package orientacaoAObjetos.membrosEstaticos.calculator.application;

import orientacaoAObjetos.membrosEstaticos.calculator.utils.CalculatorUtils;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = start.nextDouble();

        double c = CalculatorUtils.circumference(radius);
        double v = CalculatorUtils.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorUtils.PI);
    }
}
