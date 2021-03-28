package ru.job4j.condition;

public class PointEq {

    private static boolean compare;

    public static boolean eq(int x1, int y1, int x2, int y2) {
        return compare = (x1 == x2) && (y1 == y2);
    }


    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}
