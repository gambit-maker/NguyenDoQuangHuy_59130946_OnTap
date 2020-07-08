/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap1;

/**
 *
 * @author HP
 */
public class Context {
   private ITinh tinhToan;
    
    public void setTinhToan(ITinh tinhToan){
        this.tinhToan = tinhToan;
    }
    
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    } 
}
