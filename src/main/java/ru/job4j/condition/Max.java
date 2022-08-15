package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int leftright) {
        int tmp = max(right, leftright);
        return max(left, tmp);
    }

    public static int max(int left, int right, int leftright, int rightleft) {
        int tmp1 = max(right, leftright, rightleft);
        return max(left, tmp1);
        }
}
