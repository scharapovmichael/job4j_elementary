package ru.job4j.condition;

public class Triangle {


    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        double ab = 3;
        double ac = 2;
        double bc = 1;
    System.out.println(exist(ab, ac, bc));
}
}

