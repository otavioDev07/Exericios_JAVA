package poo.exFixacao.application;

import poo.exFixacao.entities.Client;
import poo.exFixacao.entities.Order;
import poo.exFixacao.entities.OrderItem;
import poo.exFixacao.entities.Product;
import poo.exFixacao.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDate birthDate = LocalDate.parse("15/03/1985", fmtData);
        Client client = new Client("Alex Green", birthDate, "alex@gmail.com");
        Order order = new Order(LocalDateTime.parse("20/04/2018 11:25:09", fmtHora), client, OrderStatus.valueOf("PROCESSING"));
        Product p1 = new Product(1000.0, "TV");
        Product p2 = new Product(40.0, "Mouse");
        OrderItem orderItem1  = new OrderItem(1, p1.getPrice(), p1);
        OrderItem orderItem2  = new OrderItem(2, p2.getPrice(), p2);

        order.addItem(orderItem1);
        order.addItem(orderItem2);

        System.out.println(order);
    }
}
