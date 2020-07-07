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
public class MonHoc {
    String tenMH;
    int id, maMH, soTC;

    public MonHoc(String tenMH, int id, int maMH, int soTC) {
        this.tenMH = tenMH;
        this.id = id;
        this.maMH = maMH;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "tenMH=" + tenMH + ", id=" + id + ", maMH=" + maMH + ", soTC=" + soTC + '}';
    }

    
    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    
    
}
