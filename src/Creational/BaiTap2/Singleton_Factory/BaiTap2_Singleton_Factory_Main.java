/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap2.Singleton_Factory;

import Creational.BaiTap3.ShapeType;

/**
 *
 * @author HP
 */
public class BaiTap2_Singleton_Factory_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory_Singleton singleton = new ShapeFactory_Singleton();
        System.out.println(singleton.createShape(ShapeType.Rectangle).draw());
        System.out.println(singleton.createShape(ShapeType.Circle).draw());
        System.out.println(singleton.createShape(ShapeType.Triangle).draw());
    }
    
}
