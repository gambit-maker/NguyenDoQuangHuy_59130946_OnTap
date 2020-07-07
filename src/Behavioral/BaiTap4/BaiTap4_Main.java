/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap4;

/**
 *
 * @author HP
 */
public class BaiTap4_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeCategory chuTich = new EmployeeCategory("Nguyễn Văn A", 1000,"Chủ Tịch");
        EmployeeCategory giamDoc = new EmployeeCategory("Nguyễn Văn B", 800,"Giám Đốc");
        EmployeeCategory phoGiamDoc = new EmployeeCategory("Nguyễn Văn C", 500,"Phó Giám Đốc");
        EmployeeCategory truongPhong = new EmployeeCategory("Nguyễn Văn D", 300,"Trưởng Phòng");
        EmployeeCategory phoTruongPhong = new EmployeeCategory("Nguyễn Văn E", 100,"Phó Trưởng Phòng");
        
        phoTruongPhong.setNext(truongPhong)
                .setNext(phoGiamDoc)
                .setNext(giamDoc)
                .setNext(chuTich);

        DuAn da = new DuAn("Build Super Super Computer",9999);                
        
        System.out.println(phoTruongPhong.getEmployeeCanApproved(da));
        
        System.out.println("\n");
        
        DuAn da1 = new DuAn("Build Super Super Computer",990);
        System.out.println(phoTruongPhong.getEmployeeCanApproved(da1));
    }
    
}
