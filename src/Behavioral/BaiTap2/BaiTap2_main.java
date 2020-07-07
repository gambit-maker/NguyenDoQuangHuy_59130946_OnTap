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
public class BaiTap2_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MonHoc mh1 = new MonHoc("Môn học A", 377, 446, 4);
        MonHoc mh2 = new MonHoc("Môn học B", 771, 221, 3);
        
        EntityDB monHocDB = new MonHocDB();
        monHocDB.objectList.add(mh1);
        monHocDB.objectList.add(mh2);
        
        //kiểm tra add môn học đã có
        System.out.println(monHocDB.addDB(mh1));
        
        //kiểm tra add môn học chưa có
        MonHoc mh3 = new MonHoc("Môn học C", 322, 778, 4);
                
        System.out.println(monHocDB.addDB(mh3));
        System.out.println(mh3.toString());
        
        //kiểm tra xóa môn học
        System.out.println(monHocDB.delete(mh1));        
        System.out.println(monHocDB.delete(mh1));
        monHocDB.displayList();
        
        //update môn học
        System.out.println("update");
        System.out.println(monHocDB.update(new MonHoc("Môn học mới", 7746, 778, 1)));
        monHocDB.displayList();
        
        //xóa bằng key
        System.out.println(monHocDB.deleteByKey(778));
        monHocDB.displayList();
    }
    
}
