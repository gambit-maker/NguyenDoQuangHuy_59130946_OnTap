/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap6_CommandPattern;

/**
 *
 * @author HP
 */
public class MuaHangCommand extends Command{

    String tenMH;
    int soLuong, donGia;
    Store store;
    
    public int getDonGia() {
        return donGia;
    }    

    @Override
    public String toString() {
        return "MuaHang{" + "tenMH=" + tenMH + ", soLuong=" + soLuong + ", donGia=" + donGia + "}\n";
    }

    
    public MuaHangCommand(String tenMH, int soLuong, int donGia, Store store) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.store = store;
    }

                
    @Override
    public void datMuaHang() {
        store.muaHang();
    }
    
    
}
