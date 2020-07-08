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
public class Store {
    GioHang gh;

    public Store(GioHang gh) {
        this.gh = gh;
    }
    
    
    public void muaHang(){
        //in thông tin hàng
        gh.getThongTinGioHang();
    }
    
    public int tongTienGioHang(){
        return gh.getTongTien();
    }
}
