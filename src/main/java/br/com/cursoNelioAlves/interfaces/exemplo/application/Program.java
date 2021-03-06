package br.com.cursoNelioAlves.interfaces.exemplo.application;

import br.com.cursoNelioAlves.interfaces.exemplo.model.entities.Contract;
import br.com.cursoNelioAlves.interfaces.exemplo.model.entities.Installment;
import br.com.cursoNelioAlves.interfaces.exemplo.model.service.ContractService;
import br.com.cursoNelioAlves.interfaces.exemplo.model.service.OnlinePaymentService;
import br.com.cursoNelioAlves.interfaces.exemplo.model.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = simpleDateFormat.parse(sc.next());
        System.out.print("Contract value: ");
        Double contractTotalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, contractTotalValue);

        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, n );

        System.out.println();
        System.out.println("Installments: ");
        for (Installment it : contract.getInstallments()) {
            System.out.println(it);
        }



        sc.close();

    }
}