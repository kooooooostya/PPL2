package com.company;

public class RightTriangle extends Triangle{

    public RightTriangle(Point pointA, Point pointB, Point pointC) throws Exception {
        super(pointA, pointB, pointC);

        if(checkTriangleIsRight())
            throw new Exception("Ошибка, данный треугольник не является прямоугольным");
    }

    public RightTriangle(Triangle triangle) throws Exception {
        super(triangle.getPointA(), triangle.getPointB(), triangle.getPointC());
        if(checkTriangleIsRight())
            throw new Exception("Ошибка, данный треугольник не является прямоугольным");
    }

    private boolean checkTriangleIsRight(){
        double[] sides = getLegsAndHypotenuse();
        return Math.pow(sides[2], 2) != Math.pow(sides[0], 2) + Math.pow(sides[1], 2);
    }

    // returns 2 legs and hypotenuse in an array, res[0], res[1] - legs, res[2] hypotenuse
    private double[] getLegsAndHypotenuse(){
        double hypotenuseLength = this.getLengthAB();
        double leg1Length = this.getLengthAC();
        double leg2Length = this.getLengthBC();
        if(hypotenuseLength < leg1Length) {
            double lengthLegCopy = leg1Length;
            leg1Length = hypotenuseLength;
            hypotenuseLength = lengthLegCopy;
        }
        if(hypotenuseLength < leg2Length) {
            double lengthLegCopy = leg2Length;
            leg2Length = hypotenuseLength;
            hypotenuseLength = lengthLegCopy;
        }
        return new double[]{leg1Length, leg2Length, hypotenuseLength};
    }

    @Override
    public void setPointAIfCorrect(Point pointA){
        Point a = this.getPointA();

        super.setPointAIfCorrect(pointA);
        if(checkTriangleIsRight())
            this.setPointAIfCorrect(a);

    }
    @Override
    public void setPointBIfCorrect(Point pointB){
        Point b = this.getPointB();

        super.setPointAIfCorrect(pointB);
        if(checkTriangleIsRight())
            this.setPointAIfCorrect(b);

    }
    @Override
    public void setPointCIfCorrect(Point pointC){
        Point c = this.getPointC();

        super.setPointAIfCorrect(pointC);
        if(checkTriangleIsRight())
            this.setPointAIfCorrect(c);

    }

    @Override
    public double getArea() {
        double[] legs = getLegsAndHypotenuse();
        return legs[0] * legs[1] / 2;
    }
}
