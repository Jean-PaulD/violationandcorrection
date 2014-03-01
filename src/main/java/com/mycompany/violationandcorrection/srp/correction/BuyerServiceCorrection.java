/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.srp.correction;

import com.mycompany.violationandcorrection.isp.correction.*;
import com.mycompany.violationandcorrection.dip.correction.*;

/**
 *
 * @author Jean-Paul
 */
public interface BuyerServiceCorrection extends StudentServiceCorrection {
    
    String studentName();
    
    String buyProduct();
    double payForProduct();
}
