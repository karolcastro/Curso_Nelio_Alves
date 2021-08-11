package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double renda;
        double imposto;

        System.out.println("Informe a renda: ");
        renda = entrada.nextDouble();

        if(renda <= 2000.00) {
            imposto = 0.0;
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.0) *0.08;

        } else if (renda <= 4500.00) {
            imposto = (renda - 3000.00) * 0.18 + 1000.00 * 0.08;

        } else {
            imposto = (renda - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }
        if ( imposto == 0.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n ", imposto);
        }

        entrada.close();
    }
}