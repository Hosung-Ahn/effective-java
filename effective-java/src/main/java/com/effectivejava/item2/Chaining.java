package com.effectivejava.item2;

public class Chaining {
    int a,b,c;

    public Chaining(int a, int b, int c) {
        a = a;
        b = b;
        c = c;
    }
    public Chaining(int a, int b) {
        this(a, b, 0);
    }
    public Chaining(int a) {
        this(a, 0);
    }

    public Chaining() {
        this(0);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
