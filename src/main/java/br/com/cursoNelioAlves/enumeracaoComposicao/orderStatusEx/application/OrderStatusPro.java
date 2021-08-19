package br.com.cursoNelioAlves.enumeracaoComposicao.orderStatusEx.application;

import java.util.Date;

import br.com.cursoNelioAlves.enumeracaoComposicao.orderStatusEx.entities.OrderEntities;
import br.com.cursoNelioAlves.enumeracaoComposicao.orderStatusEx.entities.OrderStatuss;

public class OrderStatusPro {
    public static void main(String[] args) {

        OrderEntities order = new OrderEntities(1080, new Date(), OrderStatuss.DELIVERED);

        System.out.println(order);

        OrderStatuss os1 = OrderStatuss.DELIVERED;
        OrderStatuss os2 = OrderStatuss.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
