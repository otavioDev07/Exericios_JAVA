package poo.cotacao_dolar.application;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double PRICE = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double DOLLAR = sc.nextDouble();

        double REAL = (DOLLAR * PRICE) * 1.06;
        System.out.printf("Amount to be paid in REAIS: %.2f", REAL);


        sc.close();
    }
}
