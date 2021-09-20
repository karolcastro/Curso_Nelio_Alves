package br.com.cursoNelioAlves.interfaces.exercicioInicial.model.entities;

public class Invoice {

    private Double basicsPayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicsPayment, Double tax) {
        this.basicsPayment = basicsPayment;
        this.tax = tax;
    }

    public Double getBasicsPayment() {
        return basicsPayment;
    }

    public void setBasicsPayment(Double basicsPayment) {
        this.basicsPayment = basicsPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayments() {
        return getBasicsPayment() + getTax();
    }
}
