package rounded;

import figures.Rectangle;
import lombok.Data;
import shape.Shape;

import java.util.Objects;

@Data
public class RoundedRectangle extends Rectangle implements Shape {
    private double angle;

    RoundedRectangle(double a, double b, double angle) {
        super(a, b);
        this.angle = angle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoundedRectangle that = (RoundedRectangle) o;
        return Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), angle);
    }

    public RoundedRectangle() {}

    @Override
    public void draw() {
        System.out.println("The rounded rectangle was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of rounded rectangle was changed");
    }

    @Override
    public void move() {
        System.out.println("The rounded rectangle is moving");
    }
}
