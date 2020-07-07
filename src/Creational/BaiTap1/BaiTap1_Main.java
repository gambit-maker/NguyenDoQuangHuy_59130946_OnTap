/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.BaiTap1;

/**
 *
 * @author HP
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonHeader hdh = new HoaDonHeader.Builder()
                .setMaHD("HD001")
                .setNgayBan("30-5-2020")
                .setTenKH("JohnyCage")
                .build();
        
        CTHD cthd1 = new CTHD.Builder()
                .setChietKhau(15)
                .setDonGia(9000000)
                .setSanPham("Super Computer")
                .setSoLuong(20)
                .build();
        
        CTHD cthd2 = new CTHD.Builder()
                .setChietKhau(10)
                .setDonGia(10000000)
                .setSanPham("Super Dog")
                .setSoLuong(2)
                .build();
        
        HoaDon hd = new HoaDon.Builder()
                .setThongTinChung(hdh)
                .setThongTinChiTiet(cthd2)
                .setThongTinChiTiet(cthd1)
                .build();
        
        System.out.println(hd);
        
    }
    
}
