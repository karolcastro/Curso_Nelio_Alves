package br.com.cursoNelioAlves.estruturaRepetitiva.estruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor ");
        n = entrada.nextInt();

        double valor1;
        double valor2 ;
        double valor3 ;

        System.out.println("Digite um valo:  ");
        valor1 = entrada.nextDouble();

        System.out.println("Digite um valo:  ");
        valor2 = entrada.nextDouble();

        System.out.println("Digite um valo:  ");
        valor3 = entrada.nextDouble();

        for (int i = 0; i < n ; i++) {
            double media  = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0)/ 10.0;

            System.out.println("O valor da média do 3 numeros digitados é de: " + media);
        }
        entrada.close();
    }
}