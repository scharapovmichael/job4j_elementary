package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        int expected = 0;
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when58to23then3() {
        int expected = 3;
        int x1 = 5;
        int y1 = 8;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y2, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when93to23then7() {
        int expected = 7;
        int x1 = 9;
        int y1 = 3;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}