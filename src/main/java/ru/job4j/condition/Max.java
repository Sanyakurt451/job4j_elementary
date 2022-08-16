package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int leftright) {
        return max(left, max(right, leftright));
    }

    public static int max(int left, int right, int leftright, int rightleft) {
        return max(left, max(right, leftright, rightleft));
    }
}
