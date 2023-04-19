package com.effectivejava.item2_builder;

public class NutritionFacts {
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // optional
    private final int fat; // (g) optional
    private final int sodium; // (mg) optional
    private final int carbohydrate; // (g) optional

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            NutritionFacts nutritionFacts = new NutritionFacts(this);
            if (nutritionFacts.servingSize < 0) {
                throw new IllegalArgumentException("servingSize must be positive");
            }
            if (nutritionFacts.servings < 0) {
                throw new IllegalArgumentException("servings must be positive");
            }
            if (nutritionFacts.calories < 0) {
                throw new IllegalArgumentException("calories must be positive");
            }
            if (nutritionFacts.fat < 0) {
                throw new IllegalArgumentException("fat must be positive");
            }
            if (nutritionFacts.sodium < 0) {
                throw new IllegalArgumentException("sodium must be positive");
            }
            if (nutritionFacts.carbohydrate < 0) {
                throw new IllegalArgumentException("carbohydrate must be positive");
            }
            return nutritionFacts;
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "\n\tservingSize=" + servingSize +
                "\n\tservings=" + servings +
                "\n\tcalories=" + calories +
                "\n\tfat=" + fat +
                "\n\tsodium=" + sodium +
                "\n\tcarbohydrate=" + carbohydrate +
                "\n}";

    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(cocaCola);
    }
}
