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
public class EmployeeCategory {
    String tenNV, chucVu;
    int hanMucPheDuyet;
    EmployeeCategory findNext;

    public EmployeeCategory(String tenNV, int hanMucPheDuyet, String chucVu) {
        this.tenNV = tenNV;
        this.hanMucPheDuyet = hanMucPheDuyet;        
        this.chucVu = chucVu;
    }
    
    public EmployeeCategory setNext(EmployeeCategory findNext){
        this.findNext = findNext;
        return findNext;
    }
    
    public String getEmployeeCanApproved(DuAn da){
        if (da.getSoTienVay() <= hanMucPheDuyet) {            
            StringBuilder builder = new StringBuilder();
            builder.append("Tên người duyệt: ")
                    .append(this.tenNV)
                    .append("\nChức vụ: ")
                    .append(this.chucVu)
                    .append("\nTên dự án: ")
                    .append(da.getTenDA())
                    .append("\nSố tiền vay: ")
                    .append(da.getSoTienVay());
            
            return builder.toString();
        }        
        else{
            if (findNext == null) {
                //sau khi tìm ra người cuối cùng không có khả năng phê duyệt;
                StringBuilder builder = new StringBuilder();
                builder.append("Tên dự án: ")
                        .append(da.getTenDA())                        
                        .append("\nSố tiền vay: ")
                        .append(da.getSoTienVay())
                        .append("\nCông ty không có ai có khả năng phê duyệt.");
                return builder.toString();
            }
            return findNext.getEmployeeCanApproved(da);
        }        
    }
}
