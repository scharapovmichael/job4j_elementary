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
        double result_0 = distance(0, 0, 2, 0);
        double result_1 = distance(2, 3, 2, 1);
        double result_2 = distance(5, 8, 2, 3);
        double result_3 = distance(9, 3, 2, 6);
        double result_4 = distance(7, 3, 2, 4);
        System.out.println("result (0,0) to (2,0) " + result_0);
        System.out.println("result (2,3) to (2,1) " + result_1);
        System.out.println("result (5,8) to (2,3) " + result_2);
        System.out.println("result (9,3) to (2,6) " + result_3);
        System.out.println("result (7,3) to (2,4) " + result_4);
    }
}
