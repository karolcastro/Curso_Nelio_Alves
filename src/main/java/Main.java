import java.util.Locale;

public class Main {
        public static void main(String[] args) {

            int y = 32;
            double x = 10.6365824;

            System.out.println(y);
            System.out.println(x);
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);
            Locale.setDefault(Locale.US);
            System.out.printf("%.4f%n" , x);
            System.out.println("Resultado = " + x + " metros");
            System.out.printf("Resultado = %.4f metros %n" , x);

            String nome = "Maria";
            int idade = 32;
            double renda = 4000.00;
            System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
        }
    }

