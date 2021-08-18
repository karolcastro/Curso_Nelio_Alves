package br.com.cursoNelioAlves.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codigo1 = entrada.nextInt();
        int qtd1 = entrada.nextInt();
        double valorUnitario1 = entrada.nextDouble();

        int codigo2 = entrada.nextInt();
        int qtd2 = entrada.nextInt();
        double valorUnitario2 = entrada.nextDouble();

        double valorAPagar = (qtd1*valorUnitario1) + (qtd2*valorUnitario2);

        System.out.printf("Numero = %.2f%n", valorAPagar);


        entrada.close();

    }
}
