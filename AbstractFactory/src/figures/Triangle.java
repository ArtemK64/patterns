package figures;

import lombok.Data;
import shape.Shape;

@Data
public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    protected Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {}

    @Override
    public void draw() {
        System.out.println("The triangle was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of triangle was changed");
    }

    @Override
    public void move() {
        System.out.println("The triangle is moving");
    }
}
