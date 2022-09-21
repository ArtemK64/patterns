package shape;

import factory.AbstractFactory;
import rounded.*;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeOfShape) {
        return switch (typeOfShape.toLowerCase()) {
            case "rectangle" -> new RoundedRectangle();
            case "square" -> new RoundedSquare();
            case "triangle" -> new RoundedTriangle();
            case "rhombus" -> new RoundedRhombus();
            default -> null;
        };
    }
}
