package ru.job4j.loop;

public class Mortgage {
    public static int year (int amount, int salary, double percent) {
        int year =0;
        double remainder = amount + amount * (percent / 100);
        while (remainder > 0) {
            remainder = remainder - salary;
            year++;
        }
        return year;
    }
}
