package lesson1.task3;

import lesson1.task3.Figure;

public class Square extends Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

}
