/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap3;

/**
 *
 * @author HP
 */
public class ShapeFactory {
    Shape shape;
    
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case Rectangle:
                shape = new Rectangle();
                break;
            case Circle:
                shape = new Circle();
                break;
            case Triangle:
                shape = new Triangle();
                break;
        }
        return shape;
    }
}
