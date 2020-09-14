package com.company.Tests;

import com.company.Point;
import com.company.Segment;
import org.junit.Assert;



public class SegmentTest {

    Segment mSegment;
    @org.junit.Test
    public void getLength() {
        mSegment = new Segment(new Point(1, 1), new Point(4, 5));
        Assert.assertEquals(5, (int)mSegment.getLength());
    }
}