package br.com.cursoNelioAlves.topicosBasicosJava;

import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = start.nextInt();
        int b = start.nextInt();
        int c = start.nextInt();

        if (a > b && a > c){
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }
        start.close();
    }
}