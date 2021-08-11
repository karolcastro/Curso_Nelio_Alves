package estruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valorA, valorB;

        System.out.println("Informe um valor para A: ");
        valorA = entrada.nextInt();

        System.out.println("Informe um valor para B: ");
        valorB = entrada.nextInt();

        if(valorA % valorB == 0 || valorB % valorA == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }
    }
}