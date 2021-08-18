package br.com.cursoNelioAlves.estruturaSequencial;

import java.util.Scanner;

public class ExercicioEntradaDeDadosTexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String s1, s2, s3;

        s1 = entrada.nextLine();// ler a linha inteira digitada
        s2 = entrada.nextLine();
        s3 = entrada.nextLine();

        System.out.println("Você digitou: " );
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}