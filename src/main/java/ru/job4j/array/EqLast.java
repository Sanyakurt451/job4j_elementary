package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int index = 0; index < left.length; index++) {
            if (left[index] == right[index]) {
                return true;
            }
        }
        return false;
    }
}
