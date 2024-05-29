package com.effectivejava.item5;

public class Sum {

    private static Long sumSlow() {
        Long sum = 0L;
        for (long  i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
    private static long sumFast() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // slow 일 떄
        long start = System.currentTimeMillis();
        sumSlow();
        System.out.println(System.currentTimeMillis() - start);

        // fast 일 때
        start = System.currentTimeMillis();
        sumFast();
        System.out.println(System.currentTimeMillis() - start);

        // 4~5배 빠르다.
    }
}
