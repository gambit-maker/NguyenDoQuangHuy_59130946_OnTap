/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap1;

/**
 *
 * @author HP
 */
public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(Builder builder) {
        this.maHD = builder.maHD;
        this.ngayBan = builder.ngayBan;
        this.tenKH = builder.tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHD=" + maHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + "}\n";
    }
    
    public static class Builder{
        String maHD, ngayBan, tenKH;

        public Builder() {
        }

        public Builder setMaHD(String maHD) {
            this.maHD = maHD;
            return this;
        }

        public Builder setNgayBan(String ngayBan) {
            this.ngayBan = ngayBan;
            return this;
        }

        public Builder setTenKH(String tenKH) {
            this.tenKH = tenKH;
            return this;
        }
        
        public HoaDonHeader build(){
            return new HoaDonHeader(this);
        }
        
    }
}
