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
public class Chia implements ITinh{
    @Override
    public float tinh(float a, float b) {
        return a / b;
    }   
}