package br.com.cursoNelioAlves.interfaces.exercicioInicial.application;

import br.com.cursoNelioAlves.interfaces.exercicioInicial.model.entities.CarRental;
import br.com.cursoNelioAlves.interfaces.exercicioInicial.model.entities.Vehicle;
import br.com.cursoNelioAlves.interfaces.exercicioInicial.model.services.BrazilTaxService;
import br.com.cursoNelioAlves.interfaces.exercicioInicial.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");

        System.out.print("Car model: ");
        String carModel = sc.nextLine();

        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = simpleDateFormat.parse(sc.nextLine());

        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        Date finish = simpleDateFormat.parse(sc.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println();
        System.out.println("INVOICES: ");
        System.out.println("Basic Payments: " + String.format("%.2f", carRental.getInvoice().getBasicsPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax() ));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayments()));
        sc.close();
    }
}