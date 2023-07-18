package com.effectivejava.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Elvis elvis1 = declaredConstructor.newInstance();
        Elvis elvis2 = declaredConstructor.newInstance();

        System.out.println("elvis1 = " + elvis1);
        System.out.println("elvis2 = " + elvis2);
    }
}
