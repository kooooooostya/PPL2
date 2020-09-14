package com.company.Tests;

import com.company.Point;
import com.company.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle mRectangle;

    @Before
    public void setUp(){
        mRectangle = new Rectangle(new Point(1 ,1), new Point(5 ,1),
                new Point(5 ,4), new Point(1 ,4));
    }

    @Test
    public void getPerimeter() {
        Assert.assertEquals(14, Math.round(mRectangle.getPerimeter()));
    }

    @Test
    public void getArea() {
        Assert.assertEquals(12, Math.round(mRectangle.getArea()));
    }
}