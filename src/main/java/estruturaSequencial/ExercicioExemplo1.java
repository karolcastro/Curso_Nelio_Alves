package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExemplo1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double largura = entrada.nextDouble();
        double comprimento = entrada.nextDouble();
        double metroQuadrado = entrada.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n",  area);
        System.out.printf("Preço = %.2f%n",  preco);

        entrada.close();

    }
}