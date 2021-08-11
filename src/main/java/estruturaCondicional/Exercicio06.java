package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codigo, qtd;
        double total;

        System.out.println("Informe o código do item: ");
        codigo = entrada.nextInt();

        System.out.println("Informe a quantidade do item: ");
        qtd = entrada.nextInt();

        if(codigo == 1) {
            total = qtd * 4.00;
            System.out.printf(" Total: R$ %.2f%n", total);
        } else if(codigo == 2 ) {
            total = qtd * 4.50;
            System.out.printf(" Total: R$ %.2f%n", total);
        } else if(codigo == 3 ) {
            total = qtd * 5.00;
            System.out.printf(" Total: R$ %.2f%n", total);
        } else if(codigo == 4) {
            total = qtd * 2.00;
            System.out.printf(" Total: R$ %.2f%n", total);
        } else if(codigo == 5) {
            total = qtd * 1.50;
            System.out.printf(" Total: R$ %.2f%n", total);
        }

    }
}