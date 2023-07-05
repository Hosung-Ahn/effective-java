package com.effectivejava.item1_plus.Enum;

import java.util.HashMap;
import java.util.HashSet;

public enum Country {
    KOREA("Korea"),
    CHINA("China"),
    JAPAN("Japan");

    private String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public static Country of(String countryName) {
        return Country.valueOf(countryName);
    }

    public String getCountryName() {
        return this.countryName;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println(map.size());
        map.put(1, null);
        map.put(null, 2);
        System.out.println(map.size());

        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.size());

        set.add(null);

        System.out.println(set.size());

    }

}
