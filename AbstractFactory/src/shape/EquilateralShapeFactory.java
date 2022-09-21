package shape;

import equilateral.EquilateralRectangle;
import equilateral.EquilateralRhombus;
import equilateral.EquilateralSquare;
import equilateral.EquilateralTriangle;
import factory.*;
public class EquilateralShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String typeOfShape) {
        return switch (typeOfShape.toLowerCase()) {
            case "rectangle" -> new EquilateralRectangle();
            case "square" -> new EquilateralSquare();
            case "triangle" -> new EquilateralRhombus();
            case "rhombus" -> new EquilateralTriangle();
            default -> null;
        };
    }
}
