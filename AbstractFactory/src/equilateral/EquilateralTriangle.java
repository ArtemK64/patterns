package equilateral;

import figures.Triangle;
import shape.Shape;

public class EquilateralTriangle extends Triangle implements Shape {
    EquilateralTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    public EquilateralTriangle() {}

    @Override
    public void draw() {
        System.out.println("The equilateral triangle was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of equilateral triangle was changed");
    }

    @Override
    public void move() {
        System.out.println("The equilateral triangle is moving");
    }
}
