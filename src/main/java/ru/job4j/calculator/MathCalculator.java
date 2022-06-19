package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double differenceAndDiv(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.div(first, second);
    }

    public static double whole(double first, double second) {

        return sumAndMultiply(first, second)
                + differenceAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDiv(20, 10));
        System.out.println("Результат расчета равен: " + whole(20, 10));
    }
}