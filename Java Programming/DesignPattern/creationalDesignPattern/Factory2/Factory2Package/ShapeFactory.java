package Factory2Package;

import java.io.BufferedReader;
import Factory2Package.*;

public class ShapeFactory {
    //getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if (shapeType == null ) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } 
        else  if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } 
        else  if(shapeType.equalsIgnoreCase("SQUARES ")){
            return new Squares();
        }
        return null;
    }
}