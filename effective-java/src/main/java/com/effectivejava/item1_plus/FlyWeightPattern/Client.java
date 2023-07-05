package com.effectivejava.item1_plus.FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        Character c1 = new Character('h', "white", FontFactory.getFont("godic:12"));
        Character c2 = new Character('e', "white", FontFactory.getFont("godic:12"));
        Character c3 = new Character('l', "white", FontFactory.getFont("godic:12"));
        Character c4 = new Character('l', "white", FontFactory.getFont("godic:12"));
        Character c5 = new Character('o', "white", FontFactory.getFont("godic:12"));
    }
}
