/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.BaiTap2;

/**
 *
 * @author HP
 */
public abstract class AbstractComponent {
    String name;
    String path;
    String prefix = "";

    public AbstractComponent(String name) {
        this.name = name;
        this.path = name;
    }

    public abstract void add(AbstractComponent ac);
    public abstract void remove(AbstractComponent ac);
    public abstract String getTreePostion();

    public String getPath() {
        return path;
    }       
}
