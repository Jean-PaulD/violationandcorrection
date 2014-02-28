/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.dip.correction;

/**
 *
 * @author Jean-Paul
 */
public class StudentImplementationCorrection {
    
    //private static double amount = new BuyerImplementationCorrection().getAmount();
    public static double getAmountPaid(BuyerImplementationCorrection buyerImplementationCorrection){
        return buyerImplementationCorrection.amount();
    }
}
