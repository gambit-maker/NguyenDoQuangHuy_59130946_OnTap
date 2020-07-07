/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class BoMon extends AbstractComponent{

    ArrayList<AbstractComponent> danhSachGiangVien = new ArrayList<>();
    
    public BoMon(String name) {
        super(name);
    }

    
    @Override
    public void add(AbstractComponent ac) {
        danhSachGiangVien.add(ac);
        ac.path = this.path +"\\"+ ac.path;
        ac.prefix = this.prefix + "..";
    }

    @Override
    public void remove(AbstractComponent ac) {
        if (danhSachGiangVien.contains(ac)) {
            danhSachGiangVien.remove(ac);
            return;
        }        
        for (AbstractComponent subFile:danhSachGiangVien) {
            subFile.remove(ac);
        }        
    }

    @Override
    public String getTreePostion() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (var gv : danhSachGiangVien) {
            builder.append("\n")
                    .append(gv.prefix)
                    .append(gv.getTreePostion());
        }
        return builder.toString();
    }
    
}
