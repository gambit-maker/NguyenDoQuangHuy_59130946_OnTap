/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.BaiTap3;

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
        Folder root = new Folder("root");
        Folder fd1 = new Folder("Folder 1");
        Folder fd2 = new Folder("Folder 2");        
        
        File f1 = new File("File 1");
        File f2 = new File("File 2");
        File f3 = new File("File 3");
        File f4 = new File("File 4");
        
        root.add(fd1);
        fd1.add(f1);
        fd1.add(f2);
        root.add(fd2);
        fd2.add(f3);
        fd2.add(f4);
        
        System.out.println(root.getTreeFolder());
        System.out.println(f4.getPath());
        
        System.out.println("After remove file 4");
        root.remove(f4);
        System.out.println(root.getTreeFolder());
    }
    
}
