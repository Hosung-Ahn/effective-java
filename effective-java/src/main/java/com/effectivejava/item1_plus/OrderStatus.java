package com.effectivejava.item1_plus;

import com.effectivejava.item1.Order;

import java.lang.reflect.Type;

public enum OrderStatus {
    ORDERED, SHIPPED, DELIVERED;

    public static void main(String[] args) {
        OrderStatus[] values = OrderStatus.values();
        for (OrderStatus value : values) {
            System.out.println(value);
        }
    }
}
