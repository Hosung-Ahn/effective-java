package com.effectivejava.item2.freeze;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private String name;
    private boolean freeze;

    public String name() {
        return name;
    }

    public boolean freeze() {
        return freeze;
    }

    public void setName(String name) {
        if (this.freeze) {
            throw new IllegalStateException();
        }
        this.name = name;
    }

    public void setFreeze(boolean freeze) {
        this.freeze = freeze;
    }

    private final List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.arr.add(2);
    }


}
