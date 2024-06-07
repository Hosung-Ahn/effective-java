package com.effectivejava.item9;

public class TryFinallyExample {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws Exception {
        try {
            System.out.println("In try block");
            throw new Exception("Exception in try block");
        } finally {
            System.out.println("In finally block");
            throw new Exception("Exception in finally block");
        }
    }
}
