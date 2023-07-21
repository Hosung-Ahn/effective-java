package com.effectivejava.item3.enumType;

import com.effectivejava.item3.IElvis;

public enum Elvis implements IElvis {
    INSTANCE;

    public void say() {
        System.out.println("hello");
    }



    public static void main(String[] args) {
        Elvis instance = Elvis.INSTANCE;
        instance.say();
    }

    @Override
    public void hi() {

    }

    @Override
    public void sing() {

    }
}
