package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextInt();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println();
        System.out.println("Product data: "+ product);

        System.out.print("Enter the number of product to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println();
        System.out.println("Updated data: "+ product);
        System.out.print("Enter the number of product to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println();
        System.out.println("Updated data: "+product);

    }
}
