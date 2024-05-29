package com.effectivejava.item5;

public class Regex {
    public static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final String ROMAN = "^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
    public static boolean isRomanNumeralFast(String s) {
        return s.matches(ROMAN);
    }

    public static void main(String[] args) {
        // slow 일 떄
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            isRomanNumeralSlow("MCMLXXVI");
        }
        System.out.println(System.currentTimeMillis() - start);

        // fast 일 때
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            isRomanNumeralFast("MCMLXXVI");
        }
        System.out.println(System.currentTimeMillis() - start);


    }
}
