/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.srp.correction;

import com.mycompany.violationandcorrection.isp.correction.*;

/**
 *
 * @author Jean-Paul
 */
public interface SellerServiceCorrection extends StudentServiceCorrection{
    String studentName();
    
    String SellProduct();
    double amountRecived();
}
