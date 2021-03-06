package com.company;

public class Segment {
    private Point mStartPoint;
    private Point mEndPoint;

    public Segment(Point pointX, Point pointY) {
        mStartPoint = pointX;
        mEndPoint = pointY;
    }

    public Point getStartPoint() {
        return mStartPoint;
    }

    public Point getEndPoint() {
        return mEndPoint;
    }

    public void setStartPoint(Point startPoint) {
        mStartPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        mEndPoint = endPoint;
    }

    //finds length of segment using formula: L = sqrt((x1-x2)^2 + (y1 - y2)^2)
    public double getLength(){
        return Math.sqrt(Math.pow(mStartPoint.getX() - mEndPoint.getX(), 2) +
                Math.pow(mStartPoint.getY() - mEndPoint.getY(), 2));
    }
}
