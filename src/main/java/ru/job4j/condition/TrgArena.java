package ru.job4j.condition;

public class TrgArena {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArena.area(2, 2, 2);
        System.out.println(" area(2,2,2) = " + rsl);
    }
}