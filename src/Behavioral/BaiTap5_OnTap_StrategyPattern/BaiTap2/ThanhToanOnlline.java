/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap2;

/**
 *
 * @author HP
 */
public class ThanhToanOnlline implements IThanhToan{
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000){
            return tienHang - (tienHang * 5 / 100);
        }
        else{
            return tienHang - (tienHang * 7 /100);
        }
    }
}