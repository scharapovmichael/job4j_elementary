package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int space = 0; space <= width; space++) {
            for (int sign = 0; sign <= height; sign++) {
                if ((space + sign) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }

}