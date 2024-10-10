package factory_pattern;

import factory_pattern.shape.Circle;
import factory_pattern.shape.Rectangle;
import factory_pattern.shape.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            default: return null;
        }
    }
}
