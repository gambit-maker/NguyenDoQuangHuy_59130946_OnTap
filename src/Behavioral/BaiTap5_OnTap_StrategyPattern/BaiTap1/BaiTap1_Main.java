/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.BaiTap5_OnTap_StrategyPattern.BaiTap1;

/**
 *
 * @author HP
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tính toán biểu thức
        Context context = new Context();
        
        context.setTinhToan(new Cong());
        System.out.println(context.tinh(999, 1));
        
        context.setTinhToan(new Chia());
        System.out.println(context.tinh(999, 100));     
    }
    
}
