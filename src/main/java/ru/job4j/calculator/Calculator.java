package ru.job4j.calculator;

public class Calculator {
//    public static void main(String[] args) {
//        int one = 1;
//        int two = 2;
//        int result = one + two;
//        System.out.println(result);
//        int six = 6;
//        int four = 4;
//        int five = 5;
//        int sixDivTwo = six / two;
//        int fiveMinusTwo = five - two;
//        int fourTimeTwo = four * two;
//        System.out.println(sixDivTwo);
//        System.out.println(fiveMinusTwo);
//        System.out.println(fourTimeTwo);
//        int age = 18;
//        System.out.println(age);
//        age = 19;
//        System.out.println(age);
//        one = 10;
//        two = 11;
//        result = one + two;
//        System.out.println(result);
//        int size = 10;
//        System.out.println(size);
//        size = 100;
//        System.out.println(size);
//        result = size - 5;
//        System.out.println(result);
//    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
