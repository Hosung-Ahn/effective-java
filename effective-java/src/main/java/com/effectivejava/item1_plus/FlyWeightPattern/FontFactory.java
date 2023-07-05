package com.effectivejava.item1_plus.FlyWeightPattern;

import java.util.HashMap;

public class FontFactory {
    private static HashMap<String, Font> cache = new HashMap<>();

    private FontFactory() {}

    public static Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
