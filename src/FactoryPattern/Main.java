package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory sf=new ShapeFactory();
        sf.getShape(ShapeFactory.CIRCLE);

    }
}
