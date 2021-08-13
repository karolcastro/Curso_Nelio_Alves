package estruturaRepetitiva.estruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valorX;

        System.out.println("Digite um valor para X: ");
        valorX = entrada.nextInt();

        for (int i = 1; i <= valorX; i++) {
            if( i %2 !=0) {
                System.out.println(i);
            }

        }
    }
}