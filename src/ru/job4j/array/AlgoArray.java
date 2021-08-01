package ru.job4j.array;

import java.util.*;

public class AlgoArray {
        public static void main(String[] args) {

            int[] array = new int[]{5, 3, 2, 1, 4};

            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }

            System.out.println();

            Arrays.sort(array);

            for (int index = 0; index < array.length; index++) {
                System.out.print(array[index] + " ");
            }

        }
    }


