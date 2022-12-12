/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;


/**
 *
 * @author hp
 */
public class Order {
    
    private date date;
    private String status;
    public Payment bayar;
    public OrderDetail DetailPesanan;
    public List<Customer> kustomer; 
    
    public void setCustomer(Customer c){
        kustomer.add(c);
    }
    
    public Order(OrderDetail OD){
        DetailPesanan = OD;
    }
    
    public void calcSubTotal(){
        
    }
    
    public void calcTax(){
        
    }
    
    public void calcTotal(){
        
    }
    
    public void calcTotalWeight(){
        
    }
    
}
