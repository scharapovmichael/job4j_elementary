package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert120RblThen2Dollar() {
        int an = 120;
        int v = 2;
        int r = Converter.rubleToDollar(an);
        Assert.assertEquals(v, r);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int an = 180;
        int v = 3;
        int r = Converter.rubleToDollar(an);
        Assert.assertEquals(v, r);
    }
}