package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        impossibleDiv(4);
        impossibleDiv(2);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("This is negative number");
        }
    }

    public static void impossibleDiv(int number) {
        if (number == 0) {
            System.out.println("This is negative number");
        }
    }
}
