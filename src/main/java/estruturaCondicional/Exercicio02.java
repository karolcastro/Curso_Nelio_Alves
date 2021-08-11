package estruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Informe um número");
        valor = entrada.nextInt();

        if(valor %2 == 0) {
            System.out.println("PAR");
        } else  {
            System.out.println("IMPAR");
        }

        entrada.close();
    }
}