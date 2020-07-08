/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.BaiTap1;

/**
 *
 * @author HP
 */
public class SinhVien {
    String tenSV, lop, diaChi;

    public SinhVien(String tenSV, String lop, String diaChi) {
        this.tenSV = tenSV;
        this.lop = lop;
        this.diaChi = diaChi;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}
