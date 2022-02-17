package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;


public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void thenSortArrayOf3elements() {
        int[] data = new int[]{12, 25, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{12, 15, 25};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void thenSortArrayOf5elements() {
        int[] data = new int[]{34, 8, 15, 29, 81};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{8, 15, 29, 34, 81};
        Assert.assertArrayEquals(expected, result);
    }
}