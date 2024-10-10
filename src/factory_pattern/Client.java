package factory_pattern;

import factory_pattern.shape.Shape;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
