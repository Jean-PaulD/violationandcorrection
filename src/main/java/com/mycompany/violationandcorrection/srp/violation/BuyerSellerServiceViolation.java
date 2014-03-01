/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.srp.violation;

import com.mycompany.violationandcorrection.isp.violation.*;

/**
 *
 * @author Jean-Paul
 */
public interface BuyerSellerServiceViolation extends StudentServiceViolation {
    
    String studentName();
    
    String buyProduct();
    double payForProduct();
    String SellProduct();
    double amountRecived();
}
