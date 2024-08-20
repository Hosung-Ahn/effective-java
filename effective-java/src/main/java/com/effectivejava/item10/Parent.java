package com.effectivejava.item10;

public class Parent {
    int x;

    public Parent(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Parent)) return false;
        return x == ((Parent) o).x;
    }
}
