package com.effectivejava.item2.variablearguments;

public class Sample {
    public static void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printNumbers(3,2,5);
        printNumbers(3,21,2,4);
    }
}
