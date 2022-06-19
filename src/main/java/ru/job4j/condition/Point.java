package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = pow(x2 - x1, 2) + pow(y2 - y1, 2);
        rsl = sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result0 = distance(0, 0, 2, 0);
        double result1 = distance(2, 3, 2, 1);
        double result2 = distance(5, 8, 2, 3);
        double result3 = distance(9, 3, 2, 6);
        double result4 = distance(7, 3, 2, 4);
        System.out.println("result (0,0) to (2,0) " + result0);
        System.out.println("result (2,3) to (2,1) " + result1);
        System.out.println("result (5,8) to (2,3) " + result2);
        System.out.println("result (9,3) to (2,6) " + result3);
        System.out.println("result (7,3) to (2,4) " + result4);
    }
}