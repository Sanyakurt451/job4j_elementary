package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when102to106then4() {
        double expected = 4;
        Point a = new Point(10, 2);
        Point b = new Point(10, 6);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when82to08then10() {
        double expected = 10;
        Point a = new Point(8, 2);
        Point b = new Point(0, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when121to164then2() {
        double expected = 5;
        Point a = new Point(12, 1);
        Point b = new Point(16, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when1022to1062then4() {
        double expected = 4;
        Point a = new Point(10, 2, 2);
        Point b = new Point(10, 6, 2);
        double dist1 = a.distance3d(b);
        Assert.assertEquals(expected, dist1, 0.01);
    }

    @Test
    public void when1028to10611then5() {
        double expected = 5;
        Point a = new Point(10, 2, 8);
        Point b = new Point(10, 6, 11);
        double dist1 = a.distance3d(b);
        Assert.assertEquals(expected, dist1, 0.01);
    }
}