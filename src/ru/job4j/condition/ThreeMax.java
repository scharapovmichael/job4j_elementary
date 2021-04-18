package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
         result = second;
         result = third;
        if (first < second && first > third) {
            result = second;
        }
        else if (second > first && second < third) {
            result = third;
        }
        else if (third < second && first > second) {
            result = first;
        }
        return result;
    }
}
