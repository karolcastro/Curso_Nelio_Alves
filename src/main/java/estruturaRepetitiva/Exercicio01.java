package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma senha com 4 numeros: ");
       int senha = entrada.nextInt();

       while (senha != 2002) {
           System.out.println("Senha Invalida");

           System.out.println("Digite uma senha com 4 numeros: ");
           senha = entrada.nextInt();
       }
       System.out.println("Acesso Permitido");

       entrada.close();

    }
}