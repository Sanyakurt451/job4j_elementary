package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (height1 - 100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        short height1 = 150;
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
