package br.com.cursoNelioAlves.enumeracaoComposicao.orderStatusEx.entities;

import java.util.Date;

public class OrderEntities {
    private Integer id;
    private Date moment;
    private OrderStatuss status;

    public OrderEntities() {

    }

    public OrderEntities(Integer id, Date moment, OrderStatuss status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatuss getStatus() {
        return status;
    }

    public void setStatus(OrderStatuss status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
