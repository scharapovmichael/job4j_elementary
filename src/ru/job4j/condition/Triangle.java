package ru.job4j.condition;

public class Triangle {
    private static boolean compare;

    public static boolean exist(double ab, double ac, double bc) {
        return compare = ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static void main(String[] args) {
        double ab = 2;
        double ac = 2;
        double bc = 2;

    System.out.println(exist(ab, ac, bc));
}
}

