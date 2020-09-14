package com.company;

public class Rectangle extends GeometricFigure {

    private Point mPointA;
    private Point mPointB;
    private Point mPointC;
    private Point mPointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        mPointA = pointA;
        mPointB = pointB;
        mPointC = pointC;
        mPointD = pointD;
    }

    public Point getPointA() {
        return mPointA;
    }

    public Point getPointB() {
        return mPointB;
    }

    public Point getPointC() {
        return mPointC;
    }

    public Point getPointD() {
        return mPointD;
    }

    public void setPointA(Point pointA) {
        mPointA = pointA;
    }

    public void setPointB(Point pointB) {
        mPointB = pointB;
    }

    public void setPointC(Point pointC) {
        mPointC = pointC;
    }

    public void setPointD(Point pointD) {
        mPointD = pointD;
    }

    public double getLengthAB(){
        return new Segment(mPointA, mPointB).getLength();
    }

    public double getLengthAD(){
        return new Segment(mPointA, mPointD).getLength();
    }

    public double getLengthBC(){
        return new Segment(mPointB, mPointC).getLength();
    }

    public double getLengthCD(){
        return new Segment(mPointC, mPointD).getLength();
    }

    //returns perimeter of rectangle
    @Override
    public double getPerimeter() {
        return getLengthAB() + getLengthBC() + getLengthAD() + getLengthCD();
    }

    //returns area of rectangle using formula S = AD * CD * sinADC
    @Override
    public double getArea() {
        double diagonal = new Segment(mPointA, mPointC).getLength();
        double cos = (Math.pow(getLengthAD(), 2) + Math.pow(getLengthCD(), 2) - Math.pow(diagonal, 2)) /
                (2 * getLengthCD() * getLengthAD());
        double sin = Math.sqrt(1 - Math.pow(cos, 2));

        return sin * getLengthAD() * getLengthCD();
    }
}
