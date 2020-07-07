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
public class MonHocDB extends EntityDB<MonHoc>{
    
    @Override
    public int findById(int id) {
        for(MonHoc monHoc:objectList){
            if (monHoc.getId() == id) {
                return monHoc.getId();
            }
        }
        return 0;
    }

    @Override
    public int getKey(MonHoc mh) {
        for(MonHoc monHoc:objectList){
            if (monHoc.getMaMH() == mh.getMaMH()) {
                return monHoc.getMaMH();
            }
        }
        return 0;
    }
    
}
