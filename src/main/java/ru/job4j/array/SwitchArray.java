package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int tmp = array[source];
        array[source] = array[dest];
        array[dest] = tmp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl1 = swapBorder(nums1);
        int[] rsl2 = swapBorder(nums2);
        for (int index = 0; index < rsl1.length; index++) {

            for (int i = 0; i < rsl2.length; i++) {
                System.out.println();
            }
            System.out.print(rsl1[index]);
        }
    }
}