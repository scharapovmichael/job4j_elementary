package ru.job4j.loop;

public class Factorial {
    public static int calc(int a, int n) {
        int result = 1;
        for ( a = 1; a <= n; a++) {
            result = result * a;
        }
        return result;
    }

}