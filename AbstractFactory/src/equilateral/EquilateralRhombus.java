package equilateral;

import figures.Rhombus;
import shape.Shape;

public class EquilateralRhombus extends Rhombus implements Shape {
    EquilateralRhombus(double a, double b) {
        super(a, b);
    }

    public EquilateralRhombus() {}

    @Override
    public void draw() {
        System.out.println("The equilateral rhombus was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of equilateral rhombus was changed");
    }

    @Override
    public void move() {
        System.out.println("The equilateral rhombus is moving");
    }
}
