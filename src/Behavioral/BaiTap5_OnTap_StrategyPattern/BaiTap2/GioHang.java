/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class GioHang {
    private IThanhToan hinhThucThanhToan;
    ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();
    
    public void setPhuongThucThanhToan(IThanhToan hinhIThanhToan){
        this.hinhThucThanhToan = hinhIThanhToan;
    }
    
    public double thanhToan(){
        int tongTien = 0;
        for(HangHoa hh: danhSachHangHoa){
            tongTien += hh.getGia();
        }
        return hinhThucThanhToan.thanhToan(tongTien);
    }
    
}
