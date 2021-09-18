package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount + amount * (percent / 100) - salary * year > 0) {
            year++;
        }
        return year;
    }
}
