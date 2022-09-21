package rounded;

import figures.Triangle;
import lombok.Data;
import shape.Shape;

import java.util.Objects;

@Data
public class RoundedTriangle extends Triangle implements Shape {
    private double angle;

    RoundedTriangle(double a, double b, double c, double angle) {
        super(a, b, c);
        this.angle = angle;
    }

    public RoundedTriangle() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoundedTriangle that = (RoundedTriangle) o;
        return Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), angle);
    }

    @Override
    public void draw() {
        System.out.println("The rounded triangle was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of rounded triangle was changed");
    }

    @Override
    public void move() {
        System.out.println("The rounded triangle is moving");
    }
}
