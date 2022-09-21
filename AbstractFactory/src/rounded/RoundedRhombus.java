package rounded;

import figures.Rhombus;
import lombok.Data;
import shape.Shape;

import java.util.Objects;

@Data
public class RoundedRhombus extends Rhombus implements Shape {
    private double angle;

    RoundedRhombus(double a, double b, double angle) {
        super(a, b);
        this.angle = angle;
    }

    public RoundedRhombus() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoundedRhombus that = (RoundedRhombus) o;
        return Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), angle);
    }

    @Override
    public void draw() {
        System.out.println("The rounded rhombus was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of rounded rhombus was changed");
    }

    @Override
    public void move() {
        System.out.println("The rounded rhombus is moving");
    }
}
