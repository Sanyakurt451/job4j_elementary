package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax4To3ThenMore() {
        int left = 4;
        int right = 3;
        String result = Max.max(left, right);
        String expected = "More";
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2ThenLess() {
        int left = 4;
        int right = 2;
        String result = Max.max(left, right);
        String expected = "Less";
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2ThenLess() {
        int left = 10;
        int right = 2;
        String result = Max.max(left, right);
        String expected = "More";
        Assert.assertEquals(result, expected);

    }
}
