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
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory factory = new ShapeFactory();
        
        Shape s = factory.createShape(ShapeType.Rectangle);
        System.out.println(s.draw());
        
        Shape s2 = factory.createShape(ShapeType.Circle);
        System.out.println(s2.draw());
        
        Shape s3 = factory.createShape(ShapeType.Triangle);
        System.out.println(s3.draw());
    }
    
}
