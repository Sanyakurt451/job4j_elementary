package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when42to66then2() {
        double expected = 2;
        int x1 = 4;
        int y1 = 2;
        int x2 = 6;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when82to08then10() {
        double expected = 10;
        int x1 = 8;
        int y1 = 2;
        int x2 = 0;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1412to1616then2() {
        double expected = 2;
        int x1 = 14;
        int y1 = 12;
        int x2 = 16;
        int y2 = 16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}