package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        boolean isSorted = false;
        int temp = 0;
        while (!isSorted) {
            isSorted = true;

            for (int a = 0; a < data.length - 1; a++) {
                int min = MinDiapason.findMin(data, a, data.length - 1);
                int index = FindLoop.indexOf(data, min, data[a], data.length - 1);
                if (data[a] > data[a + 1]) {
                    temp = data[a];
                    data[a] = data[a + 1];
                    data[a + 1] = temp;
                    isSorted = false;
                }
            }

        }
        return data;
    }
}

