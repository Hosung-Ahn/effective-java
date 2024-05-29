package com.effectivejava.item5;

public class Test {
    public static void main(String[] args) {
        String s1 = new String("bikini");
        String s2 = "bikini";
        String s3 = "bikini";

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true
    }
}
