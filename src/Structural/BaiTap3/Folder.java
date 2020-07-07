/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Folder extends AbstractFile{

    ArrayList<AbstractFile> danhSachFile = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }
        
    
    @Override
    public void add(AbstractFile f) {
        danhSachFile.add(f);
        f.path = this.path + "\\" + f.path;
        f.prefix = this.prefix + "..";
    }

    @Override
    public void remove(AbstractFile f) {
        if (danhSachFile.contains(f)) {
            danhSachFile.remove(f);
            return;
        }        
        for (AbstractFile subFile:danhSachFile) {
            subFile.remove(f);
        }
    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        for (AbstractFile subFile:danhSachFile) {
            builder.append("\n")
                    .append(subFile.prefix)
                    .append(subFile.getTreeFolder());
        }
        return builder.toString();
    }
    
}
