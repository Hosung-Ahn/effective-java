package com.effectivejava.item3;

public class MockElvis implements IElvis{
    @Override
    public void hi() {
        System.out.println("hi am Mock Elvis");
    }

    @Override
    public void sing() {
        System.out.println("la la la");
    }
}
