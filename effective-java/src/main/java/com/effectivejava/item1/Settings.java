package com.effectivejava.item1;

/**
 * 이 클래스의 인스턴스는 getInstance() 를 통해 사용한다.
 * @See #getInstance()
 */
public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println("settings1 = " + settings1);
        System.out.println("settings2 = " + settings2);
    }
}
