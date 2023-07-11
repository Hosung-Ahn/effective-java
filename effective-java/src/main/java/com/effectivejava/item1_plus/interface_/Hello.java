package com.effectivejava.item1_plus.interface_;

public class Hello implements HelloService {
    @Override
    public String hello() {
        return "Hello, World!";
    }

    @Override
    public String hi() {
        return "Wow";
    }


    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.hello());
        System.out.println(hello.hi());

        System.out.println(HelloService.hi2());
    }
}
