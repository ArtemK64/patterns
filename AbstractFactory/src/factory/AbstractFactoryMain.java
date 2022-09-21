package factory;

import shape.Shape;

// I used information in article from this link - https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

public class AbstractFactoryMain {
    public static void main(String[] args) {

        // is not rounded figures
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Ordinary");

        // rectangle
        Shape shapeOfRectangle = abstractFactory.getShape("rectangle");
        shapeOfRectangle.draw();
        shapeOfRectangle.changeColor();
        shapeOfRectangle.move();

        System.out.println();

        // square
        Shape shapeOfSquare = abstractFactory.getShape("square");
        shapeOfSquare.draw();
        shapeOfSquare.changeColor();
        shapeOfRectangle.move();

        System.out.println();

        // triangle
        Shape shapeOfTriangle = abstractFactory.getShape("triangle");
        shapeOfTriangle.draw();
        shapeOfTriangle.changeColor();
        shapeOfTriangle.move();

        System.out.println();

        // rhombus
        Shape shapeOfRhombus = abstractFactory.getShape("rhombus");
        shapeOfRhombus.draw();
        shapeOfRhombus.changeColor();
        shapeOfRhombus.move();

        System.out.println();

        // rounded figures
        AbstractFactory roundedAbstractFactory = FactoryProducer.getFactory("Rounded");

        // rounded rectangle
        Shape shapeOfRoundedRectangle = roundedAbstractFactory.getShape("rectangle");
        shapeOfRoundedRectangle.draw();
        shapeOfRoundedRectangle.changeColor();
        shapeOfRoundedRectangle.move();

        System.out.println();

        // rounded square
        Shape shapeOfRoundedSquare = roundedAbstractFactory.getShape("square");
        shapeOfRoundedSquare.draw();
        shapeOfRoundedSquare.changeColor();
        shapeOfRoundedSquare.move();

        System.out.println();

        // rounded triangle
        Shape shapeOfRoundedTriangle = roundedAbstractFactory.getShape("triangle");
        shapeOfRoundedTriangle.draw();
        shapeOfRoundedTriangle.changeColor();
        shapeOfRoundedTriangle.move();

        System.out.println();

        // rounded rhombus
        Shape shapeOfRoundedRhombus = roundedAbstractFactory.getShape("rhombus");
        shapeOfRoundedRhombus.draw();
        shapeOfRoundedRhombus.changeColor();
        shapeOfRoundedRhombus.move();

        System.out.println();

        // equilateral figures
        AbstractFactory equilateralAbstractFactory = FactoryProducer.getFactory("Equilateral");

        // equilateral rectangle
        Shape shapeOfEquilateralRectangle = equilateralAbstractFactory.getShape("rectangle");
        shapeOfEquilateralRectangle.draw();
        shapeOfEquilateralRectangle.changeColor();
        shapeOfEquilateralRectangle.move();

        System.out.println();

        // equilateral square
        Shape shapeOfEquilateralSquare = equilateralAbstractFactory.getShape("square");
        shapeOfEquilateralSquare.draw();
        shapeOfEquilateralSquare.changeColor();
        shapeOfEquilateralSquare.move();

        System.out.println();

        // equilateral triangle
        Shape shapeOfEquilateralTriangle = equilateralAbstractFactory.getShape("triangle");
        shapeOfEquilateralTriangle.draw();
        shapeOfEquilateralTriangle.changeColor();
        shapeOfEquilateralTriangle.move();

        System.out.println();

        // equilateral rhombus
        Shape shapeOfEquilateralRhombus = equilateralAbstractFactory.getShape("rhombus");
        shapeOfEquilateralRhombus.draw();
        shapeOfEquilateralRhombus.changeColor();
        shapeOfEquilateralRhombus.move();

        System.out.println();
    }
}
