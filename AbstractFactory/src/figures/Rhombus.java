package figures;

import lombok.Data;
import shape.Shape;

@Data
public class Rhombus implements Shape {
    private double a;
    private double b;

    protected Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rhombus() {}

    @Override
    public void draw() {
        System.out.println("The rhombus was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of rhombus was changed");
    }

    @Override
    public void move() {
        System.out.println("The rhombus is moving");
    }
}
