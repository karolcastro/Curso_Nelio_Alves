package construtores.product.application;

import construtores.product.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner start = new Scanner(System.in);


        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = start.nextLine();

        System.out.print("Price: ");
        double price = start.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = start.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.print("Product Data: " + product);

        System.out.println();
        System.out.print("Enter the number od products to be added in stock: ");
        quantity = start.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.print("Update Data: " + product);

        System.out.println();
        System.out.print("Enter the number od products to be removed from stock: ");
        quantity = start.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.print("Update Data: " + product);

        start.close();
    }
}