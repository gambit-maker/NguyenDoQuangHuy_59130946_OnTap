/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural.BaiTap1;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.PlainDocument;

/**
 *
 * @author HP
 */
public class Adapter {
    public static TableModel listAdapter(ArrayList<SinhVien> danhSachSinhVien){        
        Vector data = new Vector();
        Vector header = new Vector();                
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            Vector row = new Vector();
            row.add(danhSachSinhVien.get(i).tenSV);
            row.add(danhSachSinhVien.get(i).lop);
            row.add(danhSachSinhVien.get(i).diaChi);
            data.add(row);
        }
        header.add("Tên sinh viên");
        header.add("Lớp");
        header.add("Địa chỉ");        
        return new DefaultTableModel(data, header);
    }
}
