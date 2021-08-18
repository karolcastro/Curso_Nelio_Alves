package br.com.cursoNelioAlves.orientacaoAObjetos.membrosEstaticos.calculator.utils;

public class CalculatorUtils {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 2.0 * PI * radius * radius * radius/ 3.00;
    }
}
