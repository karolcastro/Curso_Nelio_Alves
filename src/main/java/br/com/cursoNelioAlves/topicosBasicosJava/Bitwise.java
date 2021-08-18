package br.com.cursoNelioAlves.topicosBasicosJava;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mask = 32;
        int mask2 = 0b00100000;

        System.out.println("Informe um número: ");
        int n = entrada.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
    }
}
