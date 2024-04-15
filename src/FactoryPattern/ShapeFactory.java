package FactoryPattern;

public class ShapeFactory {
   final static int CIRCLE=1;
   final static int RECTANGLE=2;

    Shape getShape(int shapeType){
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            default -> null;
        };
    }
}
