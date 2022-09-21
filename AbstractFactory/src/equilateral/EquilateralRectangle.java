package equilateral;

import figures.Rectangle;
import shape.Shape;

public class EquilateralRectangle extends Rectangle implements Shape {

    EquilateralRectangle(double a, double b) {
        super(a, b);
    }

    public EquilateralRectangle() {}

    @Override
    public void draw() {
        System.out.println("The equilateral rectangle was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of equilateral rectangle was changed");
    }

    @Override
    public void move() {
        System.out.println("The equilateral rectangle is moving");
    }
}
