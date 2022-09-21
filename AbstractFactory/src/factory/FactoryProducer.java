package factory;

import shape.EquilateralShapeFactory;
import shape.RoundedShapeFactory;
import shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String typeOfFactory) {
        return switch(typeOfFactory.toLowerCase()) {
            case "rounded" -> new RoundedShapeFactory();
            case "equilateral" -> new EquilateralShapeFactory();
            default -> new ShapeFactory();
        };
    }
}