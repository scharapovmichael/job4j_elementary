package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax4To6Then6To8Then8(){
        int left = 4;
        int right = 6;
        int middle = 8;
        int result = Max.max(left, right, middle);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax9To3Then3To5Then5(){
        int left = 9;
        int right = 3;
        int middle = 5;
        int result = Max.max(left, right, middle);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}