package orientacaoAObjetos.membrosEstaticos.cotacao.utls;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double cotacao(double dollar, double quantity) {
        double cotacaoDolar = dollar * quantity * IOF + dollar * quantity;
        return cotacaoDolar;
    }
}
