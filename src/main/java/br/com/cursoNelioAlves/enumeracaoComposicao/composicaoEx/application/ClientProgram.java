package br.com.cursoNelioAlves.enumeracaoComposicao.composicaoEx.application;

import br.com.cursoNelioAlves.construtores.product.entities.Product;
import br.com.cursoNelioAlves.enumeracaoComposicao.composicaoEx.entities.Client;
import br.com.cursoNelioAlves.enumeracaoComposicao.composicaoEx.entities.Order;
import br.com.cursoNelioAlves.enumeracaoComposicao.composicaoEx.entities.OrderItem;
import br.com.cursoNelioAlves.enumeracaoComposicao.composicaoEx.entities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ClientProgram {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date clientBirth = sdf.parse(sc.next());

        Client client = new Client(clientName, clientEmail, clientBirth);

        System.out.println();
        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.println();
        System.out.print("How many items to this order? ");
        int manyItems = sc.nextInt();

        for (int i =1; i <= manyItems; i++) {
            System.out.println();
            System.out.println("Enter #"+ i + " item data: ");

            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Product quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}