package com.company.Tests;

import com.company.Point;
import com.company.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle mTriangle;

    @Before
    public void setUp() throws Exception {
        mTriangle = new Triangle(new Point(1, 1),
                new Point(5, 1), new Point(5, 4));
    }

    @Test
    public void getPerimeter() {
        Assert.assertEquals(12, (int)mTriangle.getPerimeter());
    }

    @Test
    public void getArea() {
        Assert.assertEquals(6, Math.round(mTriangle.getArea()));
    }
}