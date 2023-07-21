package com.effectivejava.item3;

public class MetaElvis<T> {
    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() { }

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() {
        return (MetaElvis<T>) INSTANCE;
    }

    public void say(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();

        System.out.println(elvis1);
        System.out.println(elvis2);

        elvis1.say("hello");
        elvis2.say(100);

    }

}
