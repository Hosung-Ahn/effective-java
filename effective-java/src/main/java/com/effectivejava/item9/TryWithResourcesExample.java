package com.effectivejava.item9;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}