package ru.job4j.condition;

public class PointEq {

     private static boolean compare;

    public static boolean eq(int x1, int y1, int x2, int y2) {
        boolean eqX = x1 == x2;
        boolean eqY = y1 == y2;
        return compare = eqX && eqY;
    }


    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));
    }
}
