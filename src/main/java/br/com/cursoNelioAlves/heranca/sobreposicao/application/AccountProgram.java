package br.com.cursoNelioAlves.heranca.sobreposicao.application;

import br.com.cursoNelioAlves.heranca.sobreposicao.entities.Account;
import br.com.cursoNelioAlves.heranca.sobreposicao.entities.BusinessAccount;
import br.com.cursoNelioAlves.heranca.sobreposicao.entities.SavingsAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) throws ParseException {


        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());


    }
}