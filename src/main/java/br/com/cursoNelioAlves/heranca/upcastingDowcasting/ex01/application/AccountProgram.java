package br.com.cursoNelioAlves.heranca.upcastingDowcasting.ex01.application;

import br.com.cursoNelioAlves.heranca.upcastingDowcasting.ex01.entities.Account;
import br.com.cursoNelioAlves.heranca.upcastingDowcasting.ex01.entities.BusinessAccount;
import br.com.cursoNelioAlves.heranca.upcastingDowcasting.ex01.entities.SavingsAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
        System.out.println("Enter client data: ");

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.00);

        //BusinessAccount acc5 =  (BusinessAccount)acc3;// nao pode ser convertido, só vai dar erro na execucao dele
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
            if (acc3 instanceof SavingsAccount) {
                SavingsAccount acc5 = (SavingsAccount) acc3;
                acc5.updateBalance();
                System.out.println("Update!");
            }
    }
}