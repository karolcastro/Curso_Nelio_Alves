package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double valorPi = 3.14159;
        double raio = entrada.nextDouble();
        double area = valorPi * raio * raio;

        System.out.printf("Area %.4f%n= " , area);

        entrada.close();

    }
}
