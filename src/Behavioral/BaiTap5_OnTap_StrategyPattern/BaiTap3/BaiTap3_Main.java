/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap3;

/**
 *
 * @author HP
 */
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bài tập StrategyPattern bài 3
        SinhVien sv1 = new SinhVien("Alex","30-1-2000",6.5f);
        SinhVien sv2 = new SinhVien("BohnSon","22-4-2000",7);
        SinhVien sv3 = new SinhVien("Cichael","1-5-2000",9);
        SinhVien sv4 = new SinhVien("Diasa","26-6-2000",5.5f);
        
        QLSV qlsv = new QLSV();
        qlsv.danhSachSinhVien.add(sv1);
        qlsv.danhSachSinhVien.add(sv2);
        qlsv.danhSachSinhVien.add(sv3);
        qlsv.danhSachSinhVien.add(sv4);
        qlsv.setQLSV(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("So sánh theo điểm");
        qlsv.inDS();
        
        qlsv.setQLSV(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("---------------");
        System.out.println("So sánh theo tên");
        qlsv.inDS();
        
        
    }
    
}
