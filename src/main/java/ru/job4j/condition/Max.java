package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        String result = left + right >= 7 ? "More" : "Less";

        return result;

    }
}
