package lesson1.task3;

import lesson1.task3.Figure;

public class Circle extends Figure {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * pi;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * pi;
    }

}
