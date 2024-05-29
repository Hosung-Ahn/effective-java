package com.effectivejava;

public class Test {

    public static void main(String[] args) {
        int value = 5;
        changeValue(value);
        System.out.println(value); // 출력: 5, 기본 타입은 값이 변경되지 않는다.

        MyObject myObject = new MyObject();
        changeObject(myObject);
        System.out.println(myObject.value); // 출력: 10, 객체의 상태가 변경된다.

        changeObjectReference(myObject);
        System.out.println(myObject.value); // 여전히 출력: 10, 참조 자체를 변경해도 원본 객체에 영향을 미치지 않는다.
    }

    public static void changeValue(int value) {
        value = 10;
    }

    public static void changeObject(MyObject obj) {
        obj.value = 10;
    }

    public static void changeObjectReference(MyObject obj) {
        obj = new MyObject();
        obj.value = 20;
    }

    static class MyObject {
        int value = 5;
    }
}
