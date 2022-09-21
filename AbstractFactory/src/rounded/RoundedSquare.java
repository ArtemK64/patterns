package rounded;

import figures.Square;
import lombok.Data;
import shape.Shape;

import java.util.Objects;

@Data
public class RoundedSquare extends Square implements Shape {
    private double angle;

    RoundedSquare(double a, double angle) {
        super(a);
        this.angle = angle;
    }

    public RoundedSquare() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoundedSquare that = (RoundedSquare) o;
        return Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), angle);
    }

    @Override
    public void draw() {
        System.out.println("The rounded square was printed");
    }

    @Override
    public void changeColor() {
        System.out.println("The color of rounded square was changed");
    }

    @Override
    public void move() {
        System.out.println("The rounded square is moving");
    }
}
