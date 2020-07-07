/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap1;

/**
 *
 * @author HP
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreateAggregate aggregate = new ConcreateAggregate();
        aggregate.addInteger(1);
        aggregate.addInteger(249);
        aggregate.addInteger(8271);
        aggregate.addInteger(12387);
        
        ConcreteIterator iterator = new ConcreteIterator(aggregate);        
        System.out.println(iterator.First());
        while(!iterator.isDone()){
            System.out.println(iterator.Next());
        }
    }
    
}
