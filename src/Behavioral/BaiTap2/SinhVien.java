/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap2;

/**
 *
 * @author HP
 */
public class SinhVien {
    String tenSV, ngaySinh, queQuan;
    int id, maSV;   

    public SinhVien(String tenSV, String ngaySinh, String queQuan, int id, int maSV) {
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.id = id;
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    
    
}
