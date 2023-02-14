package Factory2Package;

import java.io.BufferedReader;
import Factory2Package.*;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        //ShapeFactory constructor
        ShapeFactory shapeFactory = new ShapeFactory();

        //get object of circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //get object of rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //get object of Squares and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARES");
        shape3.draw();
    }
}