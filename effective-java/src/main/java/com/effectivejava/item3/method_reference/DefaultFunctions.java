package com.effectivejava.item3.method_reference;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = (i) -> i*2;
        Function<Integer, String> f2 = Objects::toString;

        Supplier<Person> f3 = Person::new;
        Function<LocalDate, Person> f4 = Person::new;

        Consumer<String> f5 = System.out::printf;

        Predicate<Person> f6 = (p) -> p.birthday.getYear() == 2023;

    }

}
