/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap2.Singleton_Builder;

import Creational.BaiTap1.CTHD;
import Creational.BaiTap1.HoaDonHeader;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HoaDon_Singleton {
    // su dung lai bai 1
    HoaDonHeader thongTinChung;
    ArrayList<CTHD> thongTinChiTiet = new ArrayList<>();
    
    private static HoaDon_Singleton instance = new HoaDon_Singleton();

    public HoaDon_Singleton() {
    }
    
    public static HoaDon_Singleton getInstance(){
        return instance;
    }
    
    public HoaDon_Singleton(Builder builder){
        this.thongTinChiTiet = builder.thongTinChiTiet;
        this.thongTinChung = builder.thongTinChung;
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
        
        public HoaDon_Singleton build(){
            return new HoaDon_Singleton(this);
        }
    }
    
    
}
