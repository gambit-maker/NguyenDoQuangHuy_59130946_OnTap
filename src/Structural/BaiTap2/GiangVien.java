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
public class GiangVien extends AbstractComponent{

    public GiangVien(String name) {
        super(name);
    }

    
    @Override
    public void add(AbstractComponent ac) {        
    }

    @Override
    public void remove(AbstractComponent ac) {        
    }

    @Override
    public String getTreePostion() {
        return this.name;
    }
    
}
