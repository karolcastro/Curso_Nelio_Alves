package orientacaoAObjetos.membrosEstaticos.cotacao.application;

import orientacaoAObjetos.membrosEstaticos.cotacao.utls.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = start.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarQuantity = start.nextDouble();

        System.out.println(" Amount to be paid in reais = " + CurrencyConverter.cotacao(dollarPrice, dollarQuantity));

    }
}