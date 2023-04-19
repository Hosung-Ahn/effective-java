package com.effectivejava.item2_builder;

import java.util.Objects;

public class NyPizza extends Pizza{
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
        @Override public NyPizza build() {
            return new NyPizza(this);
        }
        @Override protected Builder self() { return this; }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "\n\tsize=" + size +
                "\n\ttoppings=" + toppings +
                "\n}";
    }

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL)
                .addTopping(Topping.HAM)
                .addTopping(Topping.ONION)
                .build();
        System.out.println("nyPizza = " + nyPizza);

        Calzone calzone = new Calzone.Builder()
                .addTopping(Topping.HAM)
                .sauceInside()
                .build();

        System.out.println("calzone = " + calzone);
    }
}
