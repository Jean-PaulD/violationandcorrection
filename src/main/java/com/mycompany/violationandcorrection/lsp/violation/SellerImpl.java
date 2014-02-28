/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.lsp.violation;

/**
 *
 * @author Jean-Paul
 */
public class SellerImpl implements StudentService {

    public String sellProduct() {
        return null;
        
    }

    public String itemName() {
        return null;
        
    }

    public double bookprice() {
        return 0;
        
    }

    public double sellBookPrice() {
        return 0;
        
    }

    public double buyBook() { //seller cannot buy. You can only be a buyer or seller at one time.
        return 0;
        
    }
}
