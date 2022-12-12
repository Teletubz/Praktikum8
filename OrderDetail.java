/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;


/**
 *
 * @author hp
 */
public class OrderDetail {
    
    private quantity;
    private String taxStatus;
    public List<Item> barang;
    
    public void setItem(Item i){
        barang.add(i);
    }
    
    public void calcSubTotal(){
        
    }
    
    public void calcWeight(){
        
    }
    
    public void calcTax(){
        
    }
}
