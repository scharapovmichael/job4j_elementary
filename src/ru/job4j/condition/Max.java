package ru.job4j.condition;

public class Max {

private static boolean result;
    public static int max(int left, int right) {
        left = 1;
        right = 2;
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println (result);
    }

}


