package estruturaRepetitiva.estruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int in = 0;
        int out = 0;

        System.out.println("Digite um valor ");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Digite um valor ");
            int x = entrada.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println("A quantidade que esta dentro do intervalo [10,20] é de: " + in);
        System.out.println("A quantidade que esta fora do intervalo [10,20] é de: " + out);

        entrada.close();
    }
}