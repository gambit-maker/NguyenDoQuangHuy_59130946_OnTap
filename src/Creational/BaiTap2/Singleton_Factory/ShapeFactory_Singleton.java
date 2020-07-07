/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap2.Singleton_Factory;

import Creational.BaiTap3.Circle;
import Creational.BaiTap3.Rectangle;
import Creational.BaiTap3.Shape;
import Creational.BaiTap3.ShapeType;
import Creational.BaiTap3.Triangle;

/**
 *
 * @author HP
 */
public class ShapeFactory_Singleton {
    //su dung lai bai 3
    Shape shape;
    private static ShapeFactory_Singleton instance = new ShapeFactory_Singleton();
    
    public static ShapeFactory_Singleton getInstance(){
        return instance;
    }
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
