package factory;

import shape.Shape;

public abstract class AbstractFactory {
    protected abstract Shape getShape(String typeOfShape);
}