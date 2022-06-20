package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return ru.job4j.math.MathFunction.division(first, second)
                + ru.job4j.math.MathFunction.subtraction(first, second);
    }

    public static double ammountOfFour(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.division(first, second)
                + ru.job4j.math.MathFunction.subtraction(first, second);
    }

    public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
            System.out.println("Результат расчета равен: " + subtractionAndDivision(40, 20));
            System.out.println("Результат расчета четырех операций: " + ammountOfFour(40, 10));
        }
    }


