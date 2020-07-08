/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap6_CommandPattern;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class GioHang {
    ArrayList<MuaHangCommand> listMatHang = new ArrayList<>();
        
    
    public void themHangVaoGio(MuaHangCommand matHang){
        listMatHang.add(matHang);
    }
    
    public void getThongTinGioHang(){
        for(MuaHangCommand matHang : listMatHang){
            System.out.println(matHang.toString());
        }
    }
    
    public int getTongTien(){
        int tongTien = 0;
        for (MuaHangCommand matHang : listMatHang) {
            tongTien += matHang.getDonGia();
        }
        return tongTien;
    }    
}
