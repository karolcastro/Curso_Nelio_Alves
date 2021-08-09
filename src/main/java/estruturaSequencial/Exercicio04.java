package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int funcionario = entrada.nextInt();
        double horasTrabalhadas = entrada.nextDouble();
        double valorHora = entrada.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("Numero = "  + funcionario);
        System.out.printf("Salario = R$ %.2f%n", salario);

        entrada.close();

    }
}
