package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //entrada com String
        /*String x;
        x = entrada.next();

        System.out.println("Você digitou: " + x);

        entrada.close();*/

        //entrada com inteiro
        /*int d;
        d = entrada.nextInt();

        System.out.println("Você digitou: " + d);

        entrada.close();*/

       /* //entrada com double
        double z;
        z = entrada.nextDouble();

        System.out.println("Você digitou: " + z);
        System.out.printf("Você digitou: %.2f%n",  z); // aceitar com ponto 4.5

        entrada.close();*/

       /* //entrada com char
        char t;
        t = entrada.next().charAt(0);

        System.out.println("Você digitou: " + t);

        entrada.close();*/

        //entrada com varios dados na mesma linha
        String x;
        int y;
        double z;

        x = entrada.next();
        y = entrada.nextInt();
        z = entrada.nextDouble();

        System.out.println("Você digitou: " );
        System.out.println( x);
        System.out.println(y);
        System.out.println(z);

        entrada.close();
    }
}