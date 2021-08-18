package br.com.cursoNelioAlves.estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horaInicio, horaFinal, duracao;

        System.out.println("Informe a hora inicial: ");
        horaInicio = entrada.nextInt();

        System.out.println("Informe a hora final: ");
        horaFinal = entrada.nextInt();

        if(horaInicio < horaFinal) {
            duracao = horaFinal - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFinal;
        }
        System.out.println("O jogo durou: " + duracao + " hora(s)");

        entrada.close();
    }
}