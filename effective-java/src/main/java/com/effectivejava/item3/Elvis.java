package com.effectivejava.item3;

public class Elvis implements IElvis{
    private static final Elvis INSTANCE = new Elvis();

    public Elvis getInstance() {
        return INSTANCE;
    }

    private static boolean created = false;
    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("싱글톤 객체가 이미 생성되었습니다.");
        }
        created = true;
    }
    public void hi() {
        System.out.println("hi i am Elvis");
    }

    public void sing() {
        System.out.println("la la la");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.hi();
    }
}
