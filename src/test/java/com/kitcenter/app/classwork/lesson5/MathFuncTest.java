package com.kitcenter.app.classwork.lesson5;


import com.kitcenter.app.homework.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expResult = 2;
        Assert.assertEquals(expResult, MathFunc.multiply(a, b));
    }
}
