/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public abstract class EntityDB<T> {
    ArrayList<T> objectList = new ArrayList<>();
       
    public void displayList(){
        for(T o: objectList){
            System.out.println(o.toString());
        }
    }
    
    public boolean addDB(T object){
        if (objectList.contains(object)) {
            return false;
        }
        else{
            objectList.add(object);
            return true;
        }

    }
    
    public int update(T object){                        
        for (int i = 0; i < objectList.size(); i++) {
            if (getKey(object) == getKey(objectList.get(i))) {
                objectList.set(i, object);
                return 1;
            }
        }
        return 0;
    }
    
    public int delete(T object){
        for(T o : objectList){
            if (getKey(o) == getKey(object)) {
                objectList.remove(o);
                return 1;
            }
        }
        return 0;
    }
    
    public int deleteByKey(int id){
        for(T o : objectList){
            if (getKey(o) == id) {
                objectList.remove(o);
                return 1;
            }
        }
        return 0;
    }
    public abstract int findById(int id);
    public abstract int getKey(T key);
}
