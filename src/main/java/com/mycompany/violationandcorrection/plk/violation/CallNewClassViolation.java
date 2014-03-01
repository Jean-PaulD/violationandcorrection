/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.plk.violation;

/**
 *
 * @author Jean-Paul
 */
public class CallNewClassViolation {
    public void newMethod(){
        SellerImpl seller = new SellerImpl();
        //below is the blatant violation of this human rights
        seller.newClass.oldClass(); 
        
    }
            
}
