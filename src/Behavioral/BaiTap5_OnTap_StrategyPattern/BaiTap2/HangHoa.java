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
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;
    
    public HangHoa(String tenHH, int gia, String moTa){
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "tenHH=" + tenHH + ", gia=" + gia + ", moTa=" + moTa + '}';
    }
    
    
    
    public int getGia(){
        return gia;
    }
    
    public void setGia(int gia){
        this.gia = gia;
    }
}
