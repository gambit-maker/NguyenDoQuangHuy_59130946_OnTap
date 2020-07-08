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
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bài tập StrategyPattern bài 2
        HangHoa h1 = new HangHoa("Hàng hóa A", 10000, "Mô tả A");
        HangHoa h2 = new HangHoa("Hàng hóa B", 99000, "Mô tả B");
        HangHoa h3 = new HangHoa("Hàng hóa C", 32000, "Mô tả C");

        GioHang gh1 = new GioHang();
        gh1.danhSachHangHoa.add(h1);
        gh1.danhSachHangHoa.add(h2);
        gh1.danhSachHangHoa.add(h3);
        gh1.setPhuongThucThanhToan(new ThanhToanCOD());        
        System.out.println("Giá thanh toán COD: "+gh1.thanhToan());
        
        
        GioHang gh2 = new GioHang();
        gh2.danhSachHangHoa.add(h1);
        gh2.danhSachHangHoa.add(h2);
        gh2.danhSachHangHoa.add(h3);
        gh2.setPhuongThucThanhToan(new ThanhToanOnlline());
        System.out.println("Giá thanh toán Onlline: "+gh2.thanhToan());
        
        
    }
    
}
