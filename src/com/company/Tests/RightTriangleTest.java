package com.company.Tests;

import com.company.Point;
import com.company.RightTriangle;
import com.company.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class RightTriangleTest {

    @Test
    public void getArea() throws Exception {
        RightTriangle triangle = new RightTriangle(new Point(1, 1),
                new Point(5, 1), new Point(5, 4));
        Triangle triangle1 = new Triangle(new Point(1, 1),
                new Point(5, 1), new Point(5, 4));
        Assert.assertEquals(Math.round(triangle.getArea()), Math.round(triangle1.getArea()));
    }
}