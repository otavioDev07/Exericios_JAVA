package poo.estudovetor.application;

import poo.estudovetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //Cria o vetor
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //atribui o valor
            vect[i] = new Product(name, price);
        }

        // calcula a soma
        double sum = 0.0;
        for (Product product : vect) {
            sum += product.getPrice();
        }
        // calcula média
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
