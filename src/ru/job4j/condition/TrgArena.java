package ru.job4j.condition;


//import static java.lang.Math.sqrt;

public class TrgArena {
    public static double area(double a, double b, double c, double p) {
        double rsl = p * (p - a) * (p - b) * (p - c);
//        rsl = sqrt
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArena.area(2, 2, 2, 3);
        System.out.println("area(2,2,2)=" + rsl);
    }
}
