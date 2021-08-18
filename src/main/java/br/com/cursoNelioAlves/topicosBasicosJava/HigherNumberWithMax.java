package br.com.cursoNelioAlves.topicosBasicosJava;

import java.util.Scanner;

public class HigherNumberWithMax {
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = start.nextInt();
        int b = start.nextInt();
        int c = start.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        start.close();

    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}