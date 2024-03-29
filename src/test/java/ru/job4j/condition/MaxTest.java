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
    public void whenMax1To2To3To4Then4() {
        int left = 1;
        int right = 2;
        int leftright = 3;
        int rightleft = 4;
        int result = Max.max(left, right, leftright, rightleft);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To4Then4() {
        int left = 1;
        int right = 2;
        int leftright = 4;
        int result = Max.max(left, right, leftright);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax20To6Then20() {
        int left = 20;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);

    }
}