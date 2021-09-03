package br.com.cursoNelioAlves.interfaces.exercicioInicial.model.services;

import br.com.cursoNelioAlves.interfaces.exercicioInicial.model.entities.CarRental;
import br.com.cursoNelioAlves.interfaces.exercicioInicial.model.entities.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService brazilTaxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = brazilTaxService;
    }

    public  void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2 - t1)/ 1000 / 60 / 60;

        double basicPayment;
        if (hours <= 12) {
            basicPayment  = Math.ceil(hours) * pricePerHour;
        } else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
