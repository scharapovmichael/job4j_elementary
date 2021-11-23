package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int n = data.length;
        for (int i = 0; i < n / 2; i++) {
            boolean temp = data[n - i - 1];
            data[n - i - 1] = data[i];
            data[i] = temp;
        }
        return result;
    }
}



