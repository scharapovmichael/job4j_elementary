package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int a = 0;
        int n = 5;
        int result = Counter.sumByEven(a, n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }
}