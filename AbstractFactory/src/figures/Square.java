package figures;

import lombok.Data;
import shape.Shape;

@Data
public class Square implements Shape {
    private double a;

    protected Square(double a) {
        this.a = a;
    }

    public Square() {}

    @Override
    public void draw() {
        System.out.println("The square was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of square was changed");
    }

    @Override
    public void move() {
        System.out.println("The square is moving");
    }
}