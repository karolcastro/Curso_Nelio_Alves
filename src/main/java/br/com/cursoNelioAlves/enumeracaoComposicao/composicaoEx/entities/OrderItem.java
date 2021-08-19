package br.com.cursoNelioAlves.enumeracaoComposicao.composicaoEx.entities;

import br.com.cursoNelioAlves.construtores.product.entities.Product;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;
    public OrderItem() {

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subtotal() {
        return price * quantity;
    }
}
