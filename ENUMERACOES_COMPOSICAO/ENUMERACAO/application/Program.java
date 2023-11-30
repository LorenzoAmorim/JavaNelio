package ENUMERACOES_COMPOSICAO.ENUMERACAO.application;

import ENUMERACOES_COMPOSICAO.ENUMERACAO.entities.enums.Order;
import ENUMERACOES_COMPOSICAO.ENUMERACAO.entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //Conversão de String para enum. Ambas as instanciações funcionam
        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}

