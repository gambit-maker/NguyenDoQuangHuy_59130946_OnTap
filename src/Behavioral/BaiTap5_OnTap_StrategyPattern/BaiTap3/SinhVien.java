/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap3;

import java.util.Date;

/**
 *
 * @author HP
 */
public class SinhVien {
    private String ten,ngaySinh;    
    private float diemTB;
    
    public SinhVien(String ten, String ngaySinh, float diemTB){
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }       
    
    public String getTen(){
        return ten;
    }
    
    public void setTen(String hoTen){
        this.ten = hoTen; 
    }
    
    public float getDiemTB(){
        return diemTB;
    }
    
    public void setDiemTB(float diemTB){
        this.diemTB = diemTB;
    }
        
    public String toString(){
        return "Tên: "+ten+"\nNgày sinh: "+ngaySinh+"\nĐiểm trung bình: "+diemTB+"\n";
    }
}
