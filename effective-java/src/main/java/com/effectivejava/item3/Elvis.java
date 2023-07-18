package com.effectivejava.item3;

public class Elvis implements IElvis{
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public void hi() {
        System.out.println("hi i am Elvis");
    }

    public void sing() {
        System.out.println("la la la");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.hi();
    }
}
