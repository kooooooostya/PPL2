package com.company;

public class Triangle extends GeometricFigure{

    private Point mPointA;
    private Point mPointB;
    private Point mPointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        mPointA = pointA;
        mPointB = pointB;
        mPointC = pointC;
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

    public void setPointA(Point pointA) {
        mPointA = pointA;
    }

    public void setPointB(Point pointB) {
        mPointB = pointB;
    }

    public void setPointC(Point pointC) {
        mPointC = pointC;
    }

    public double getLengthAB(){
        return new Segment(mPointA, mPointB).getLength();
    }
    public double getLengthAC(){
        return new Segment(mPointA, mPointC).getLength();
    }
    public double getLengthBC(){
        return new Segment(mPointB, mPointC).getLength();
    }

    //finds perimeter
    @Override
    public double getPerimeter(){
        double perimeter = 0;
        perimeter += this.getLengthAB();
        perimeter += this.getLengthAC();
        perimeter += this.getLengthBC();
        return perimeter;
    }

    //finds area using formula S = sqrt(p*(p-a)(p-b)(p-c))
    @Override
    public double getArea() {
        double semiPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.getLengthAB()) *
                (semiPerimeter - getLengthAC()) * (semiPerimeter -getLengthBC()));
    }

}
