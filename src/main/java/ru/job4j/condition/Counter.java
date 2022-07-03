package ru.job4j.condition;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = 0; finish <= 5; finish++) {
            sum = sum + finish;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}

