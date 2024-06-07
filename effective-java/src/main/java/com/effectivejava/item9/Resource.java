package com.effectivejava.item9;

public class Resource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing resource");
        throw new Exception("Exception in close");
    }

    public void doSomething() throws Exception {
        System.out.println("Using resource");
        throw new Exception("Exception in try block");
    }
}
