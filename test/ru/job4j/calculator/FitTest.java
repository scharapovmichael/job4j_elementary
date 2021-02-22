package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan168Then86() {
        short in = 168;
        double expected = 78.2;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman160Then82() {
        short in = 160;
        double expected = 69.0;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}