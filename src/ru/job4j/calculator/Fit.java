package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        short heigt = 187;
        return (heigt-100)*1.15;
    }
    public static double womanWeight(short height) {
        short heigt = 160;
         return (heigt-110)*1.15;
    }
    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
         height =160;
        double woman = Fit.womanWeight(height);
        System.out.println("Man is " + man);
        System.out.println("Woman is " + woman);
    }
}
