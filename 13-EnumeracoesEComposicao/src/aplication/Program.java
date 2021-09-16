package aplication;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        // Conversão de String para enum

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        order.setStatus(OrderStatus.valueOf("DELIVERED"));
        System.out.println(os1);
        System.out.println(os2);
        System.out.println(order);

        //Notação UML para um tipo enumerado




    }
}
