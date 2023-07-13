package com.effectivejava.item2.javabean;

import java.io.Serializable;

public class Sample implements Serializable {
    private int age;
    private boolean target;

    public int age() {
        return age;
    }

    public boolean target() {
        return target;
    }
}
