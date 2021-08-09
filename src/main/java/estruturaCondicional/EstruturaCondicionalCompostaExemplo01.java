package estruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalCompostaExemplo01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas ?");
        hora = entrada.nextInt();

        if( hora < 12) {
            System.out.println("Bom Dia !!");
        } else {
            System.out.println("Boa Tarde !!");
        }


        entrada.close();
    }
}
