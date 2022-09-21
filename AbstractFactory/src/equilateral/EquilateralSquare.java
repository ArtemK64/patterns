package equilateral;

import figures.Square;
import shape.Shape;

public class EquilateralSquare extends Square implements Shape {
    EquilateralSquare(double a) {
        super(a);
    }

    public EquilateralSquare() {}

    @Override
    public void draw() {
        System.out.println("The equilateral square was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of equilateral square was changed");
    }

    @Override
    public void move() {
        System.out.println("The equilateral square is moving");
    }
}
