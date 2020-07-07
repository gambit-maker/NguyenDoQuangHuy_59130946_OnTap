/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap3;

/**
 *
 * @author HP
 */
public class BaiTap3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TaiKhoan tk = new TaiKhoan(10);        
        
        ATM atm = new ATM();
        atm.thietLapTK(tk);
        atm.rutTien(11);        
                
        atm.rutTien(5);                 
                        
    }        
}
