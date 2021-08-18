package br.com.cursoNelioAlves.estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        System.out.println("Digite um código: ");
        codigo = entrada.nextInt();

        while (codigo != 4) {
            if(codigo == 1) {
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 3) {
                diesel = diesel + 1;
            }
            System.out.println("Digite um código: ");
            codigo = entrada.nextInt();
        }
        System.out.println("Muito Obrigada");
        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);

        entrada.close();
    }
}