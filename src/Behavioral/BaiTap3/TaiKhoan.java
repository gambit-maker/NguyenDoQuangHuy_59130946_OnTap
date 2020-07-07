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
public class TaiKhoan implements ATM.ATM_Observer{
    int soDu;

    public TaiKhoan(int soTienDangCo) {
        this.soDu = soTienDangCo;
    }
            

    @Override
    public void nhanThongBao(int soTienDaRut, String thongBao) {
        System.out.println("Số tiền rút "+soTienDaRut +" " + thongBao + "Số dư còn lại: "+soDu);
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if (soDu >= soTienRut) {
            soDu -= soTienRut;
            return true;
        }
        else{            
            return false;
        }
    }
}
