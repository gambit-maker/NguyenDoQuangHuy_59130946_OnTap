/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ConcreateAggregate extends Aggregate<Integer>{
    ArrayList<Integer> numberArray = new ArrayList<>();

    public ConcreateAggregate() {
    }
    
    public void addInteger(int n){
        numberArray.add(n);
    }
    
    
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    
    public int count(){
        return numberArray.size() - 1;
    }
    
    public int getItem(int i){
        return numberArray.get(i);
    }
}
