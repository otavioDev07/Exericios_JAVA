package poo.estoque.application;

import poo.estoque.entitie.Product;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
//· Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
//· Realizar uma entrada no estoque e mostrar novamente os dados do produto
//· Realizar uma saída no estoque e mostrar novamente os dados do produto

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}
