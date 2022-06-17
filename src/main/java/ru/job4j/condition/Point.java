package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow(6 - 4, 2);
        double rs2 = Math.pow(2 - 1, 2);
        double rs3 = rsl + rs2;
        return rs3;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 4, 2, 1);
        System.out.println("result (6, 4) to (2,1) " + result);
    }
}