package br.com.cursoNelioAlves.enumeracaoComposicao.orderStatus.application;

import br.com.cursoNelioAlves.enumeracaoComposicao.orderStatus.entities.Order;
import br.com.cursoNelioAlves.enumeracaoComposicao.orderStatus.entitiesEnums.OrderStatus;

import java.text.ParseException;
import java.util.Date;

public class OrderStatusProgram {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }


}