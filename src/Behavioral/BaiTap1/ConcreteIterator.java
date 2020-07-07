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
public class ConcreteIterator extends Iterator{
    
    ConcreateAggregate aggregate;
    int position;
    
    public ConcreteIterator(ConcreateAggregate aggregate) {
        this.aggregate = aggregate;
        position = 0;
    }
    
    @Override
    public Object First() {
        position = 0;
        return currentItem();
    }

    @Override
    public Object Next() {
        position++;
        return currentItem();
    }

    @Override
    public boolean isDone() {
        return position >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        if (position <= aggregate.count()) {
            return aggregate.getItem(position);
        }
        return null;
    }    
}
