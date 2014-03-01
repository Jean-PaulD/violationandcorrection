/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.lsp.correction;

/**
 *
 * @author Jean-Paul
 */
public interface StudentServiceCorrection extends SellerServiceCorrection{
    
    String itemName();
    double bookprice();
    double sellBookPrice();
    double buyBook();
}
