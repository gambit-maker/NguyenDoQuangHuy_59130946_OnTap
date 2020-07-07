/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap2;

/**
 *
 * @author HP
 */
public class SinhVienDB extends EntityDB<SinhVien>{

    @Override
    public int findById(int id) {
        for(SinhVien sinhVien:objectList){
            if (sinhVien.getId() == id) {
                return sinhVien.getId();
            }
        }
        return 0;
    }

    @Override
    public int getKey(SinhVien sv) {
        for(SinhVien sinhVien:objectList){
            if (sinhVien.getMaSV()== sv.getMaSV()) {
                return sinhVien.getMaSV();
            }
        }
        return 0;    
    }
    
}
