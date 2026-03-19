package poo.etiqueta.application;

import poo.etiqueta.entities.ImportedProduct;
import poo.etiqueta.entities.UsedProduct;
import poo.etiqueta.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p1 = new ImportedProduct("Tablet", 280.00, 20.00);
        Product p2 = new Product("Notebook", 1100.00);
        Product p3 = new UsedProduct("Iphone", 400.00, sdf.parse("15/03/2026"));

        System.out.println(p1.priceTag());
        System.out.println(p2.priceTag());
        System.out.println(p3.priceTag());
    }
}
