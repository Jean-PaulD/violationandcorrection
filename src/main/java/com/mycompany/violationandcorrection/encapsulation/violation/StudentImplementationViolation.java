/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.encapsulation.violation;

/**
 *
 * @author Jean-Paul
 */
public class StudentImplementationViolation {
    
    public static double amount = new BuyerImplementationViolation().getAmount();
    public static double getAmountPaid(){
        return amount;
    }
}
