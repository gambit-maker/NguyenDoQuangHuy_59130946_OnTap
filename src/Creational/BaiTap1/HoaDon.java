/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HoaDon {
    HoaDonHeader thongTinChung;
    ArrayList<CTHD> thongTinChiTiet = new ArrayList<>();       

    public HoaDon(Builder builder) {
        this.thongTinChung = builder.thongTinChung;
        this.thongTinChiTiet = builder.thongTinChiTiet;
    }

    @Override
    public String toString() {
        return "HoaDon\n" + thongTinChung + inThongTin();
    }
    
    public String inThongTin(){
        String result = "";
        for(CTHD cthd: thongTinChiTiet){
            result += cthd.toString();
        }
        return result;
    }
    
    
    public static class Builder{
        HoaDonHeader thongTinChung;
        ArrayList<CTHD> thongTinChiTiet = new ArrayList<>();

        public Builder() {
        }
        
        public Builder setThongTinChung(HoaDonHeader thongTinChung) {
            this.thongTinChung = thongTinChung;
            return this;
        }

        public Builder setThongTinChiTiet(CTHD cthd) {
            this.thongTinChiTiet.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
