package com.effectivejava.item3;

import java.io.Serializable;

public class Book implements Serializable {
    private String name = "Effective Java";

    private int price = 100;

    private transient String author = "Joshua Bloch";
}
