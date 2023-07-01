package com.effectivejava.item1;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

    public Order(Product product, boolean prime) {
        this.product = product;
        this.prime = prime;
    }

    public Order(Product product, boolean urgent) {
        this.product = product;
        this.urgent = urgent;
    }
}
