package figures;

import lombok.Data;
import shape.Shape;

@Data
public class Rectangle implements Shape {
    private double a;
    private double b;

    protected Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {}

    @Override
    public void draw() {
        System.out.println("The rectangle was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of rectangle was printed");
    }

    @Override
    public void move() {
        System.out.println("The rectangle is moving");
    }
}