package com.effectivejava.item10;

public class Child {
    private Parent parent;

    private int y;

    public Child(Parent parent, int y) {
        this.parent = parent;
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if ( ! (o instanceof Child)) return false;
        Child target = (Child) o;
        return this.parent.equals(target.parent) && this.y == target.y;
    }

    public static void main(String[] args) {
        Parent parent = new Parent(10);
        Child child = new Child(parent, 20);

        System.out.println(parent.equals(child)); // false
        System.out.println(child.equals(parent)); // false
    }
}
