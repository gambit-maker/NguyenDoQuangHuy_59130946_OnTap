/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class QLSV {
    ISoSanh<SinhVien> qLSV;
    ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
            
    public void setQLSV(ISoSanh<SinhVien> qLSV){
        this.qLSV = qLSV;
    }       
    
    public void sapXep(){        
        SinhVien temp;                
        for(int i=0 ; i < danhSachSinhVien.size()-1 ; i++ ){
            for(int j=0 ; j< danhSachSinhVien.size()-i-1 ; j++){
                if(qLSV.soSanh(danhSachSinhVien.get(j), danhSachSinhVien.get(j+1))>=1){                    
                    temp = danhSachSinhVien.get(j);
                    danhSachSinhVien.set(j, danhSachSinhVien.get(j+1));
                    danhSachSinhVien.set(j+1, temp);                    
                }
            }
        }
    }
    
    public void inDS(){
        for(SinhVien i:danhSachSinhVien){
            System.out.println(i.toString());
        }
    }
}
