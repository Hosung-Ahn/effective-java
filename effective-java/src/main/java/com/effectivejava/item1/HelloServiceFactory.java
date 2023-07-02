package com.effectivejava.item1;

public class HelloServiceFactory {
    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        }
        else {
            return new EnglishHelloService();
        }
    }

    // 아래 코드를 지금의 class 밖에서 호출한다고 가정하자.
    public static void main(String[] args) {
        HelloService ko = HelloServiceFactory.of("ko");
    }
}
