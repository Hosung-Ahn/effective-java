package com.effectivejava.item1;

import javax.lang.model.SourceVersion;

public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }

    public static void main(String[] args) {
        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();

        System.out.println("settings1 = " + settings1);
        System.out.println("settings2 = " + settings2);
    }
}
