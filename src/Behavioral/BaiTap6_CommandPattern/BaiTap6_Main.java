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
public class BaiTap6_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh = new GioHang();
        Store s = new Store(gh);
        
        MuaHangCommand mh1 = new MuaHangCommand("Mặt hàng A", 10, 990000, s);
        MuaHangCommand mh2 = new MuaHangCommand("Mặt hàng B", 9, 89000, s);
        MuaHangCommand mh3 = new MuaHangCommand("Mặt hàng C", 7, 190000, s);
        MuaHangCommand mh4 = new MuaHangCommand("Mặt hàng D", 20, 200000, s);
                
        
        gh.themHangVaoGio(mh1);
        gh.themHangVaoGio(mh2);        
        gh.themHangVaoGio(mh3);
        gh.themHangVaoGio(mh4);
        
        gh.getThongTinGioHang();
        System.out.println("Tổng tiền: "+gh.getTongTien());
    }
    
}
