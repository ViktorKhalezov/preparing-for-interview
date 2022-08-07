package lesson1.task3;

public class Triangle extends Figure {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = 0.5 * (firstSide + secondSide + thirdSide);
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    @Override
    public double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }


}
