package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are 3. Test result : " + passed);
        System.out.println("180 rubles are " + dollar + " dollars ");

    }
}
