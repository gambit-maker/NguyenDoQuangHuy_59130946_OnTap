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
public class ATM {
    ATM_Observer observer;    
    
    public boolean kiemTraTienRut(int soTienRut){
        return observer.kiemTraSoDu(soTienRut);
    }
    
    public void rutTien(int soTienRut){
        if (observer != null) {
            if (kiemTraTienRut(soTienRut)) {
                observer.nhanThongBao(soTienRut, "Đã rút tiền ");
            }
            else{
                observer.nhanThongBao(0, "Số dư không đủ ");
            }
        }
    }
    
    public void thietLapTK(ATM_Observer observer){
        this.observer = observer;
    }
    
    public static interface ATM_Observer{
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienDaRut, String thongBao);
    }
}
