package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 4, 2, 1);
        System.out.println("result (6, 4) to (2,1) " + result);
    }
}