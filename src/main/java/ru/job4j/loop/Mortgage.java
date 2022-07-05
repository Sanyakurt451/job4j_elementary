package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (year < amount) {
        amount = (amount * percent) - salary;
        salary = (amount * percent) - salary / amount;

        year++;
        }
        return year;
    }
}

