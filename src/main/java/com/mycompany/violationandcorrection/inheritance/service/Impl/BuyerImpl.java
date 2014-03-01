/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.inheritance.service.Impl;

import com.mycompany.violationandcorrection.inheritance.service.Buyer;

/**
 *
 * @author Jean-Paul
 */
public class BuyerImpl implements Buyer{
    
    private boolean cancel = false;
    private double bid;
    private String itemName = "book1";
    private double price = 12.2;
    
    public double makeBid(double bid) {
        return 0.1;
    }

    public boolean cancelBid() {
        return cancel;
    }

    public String itemName() {
        return itemName;
     }

    public double price() {
        return price;
    }

    public boolean avilable() {
        return false;
     }

    public boolean cancelBid(boolean cancel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
