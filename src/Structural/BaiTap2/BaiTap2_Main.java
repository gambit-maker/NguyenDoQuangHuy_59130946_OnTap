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
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BoMon bm1 = new BoMon("Khoa A");
        BoMon bm2 = new BoMon("Môn học B");
        BoMon bm3 = new BoMon("Môn học C");
        
        GiangVien gv1 = new GiangVien("Nguyễn Văn A");        
        GiangVien gv2 = new GiangVien("Nguyễn Văn B");
        GiangVien gv3 = new GiangVien("Nguyễn Văn C");
        GiangVien gv4 = new GiangVien("Nguyễn Văn D");
        GiangVien gv5 = new GiangVien("Nguyễn Văn E");
        
        bm1.add(bm2);
        bm1.add(bm3);
        
        bm1.add(gv1);
        bm1.add(gv2);
        
        bm2.add(gv3);
        bm2.add(gv4);
        bm2.add(gv5);
        
        System.out.println(bm1.getTreePostion());
    }
    
}
