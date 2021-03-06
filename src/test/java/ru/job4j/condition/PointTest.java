package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when102to106then4() {
        double expected = 4;
        int x1 = 10;
        int y1 = 2;
        int x2 = 10;
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
    public void when121to164then2() {
        double expected = 5;
        int x1 = 12;
        int y1 = 1;
        int x2 = 16;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}