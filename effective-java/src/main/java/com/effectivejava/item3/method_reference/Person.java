package com.effectivejava.item3.method_reference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {
    LocalDate birthday;

    public Person() {
    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public int comparedByAge(Person b) {
        return this.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> arr = new ArrayList<>();
        arr.add(new Person(LocalDate.of(1965, 1, 25)));
        arr.add(new Person(LocalDate.of(1985, 1, 25)));
        arr.add(new Person(LocalDate.of(2005, 1, 25)));

        arr.sort(Person::comparedByAge);

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1965, 1, 25));
        dates.add(LocalDate.of(1965, 1, 25));

        List<Person> mappedPeople = dates.stream().map(Person::new).toList();
    }
}
