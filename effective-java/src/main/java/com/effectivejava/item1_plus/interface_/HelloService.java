package com.effectivejava.item1_plus.interface_;

import java.util.*;

public interface HelloService {
    String hello();

    default String hi() {
        return "Hello, World!";
    }

    static String hi2() {
        String s = prepareMessage();
        return s + "Hello";
    }

    private static String prepareMessage() {
        return "Ready.";
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<10;i++) {
            arr.add(random.nextInt(100));
        }

        Comparator<Integer> desc = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        arr.sort(desc.reversed());

        System.out.println(arr);

    }
}
