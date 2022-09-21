package shape;

import factory.AbstractFactory;
import figures.*;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeOfShape) {
        return switch (typeOfShape.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            case "triangle" -> new Triangle();
            case "rhombus" -> new Rhombus();
            default -> null;
        };
    }
}
