/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.plk.correction;

import com.mycompany.violationandcorrection.plk.violation.*;

/**
 *
 * @author Jean-Paul
 */
public class CallNewClassCorrection {
    public void newMethod(){
        SellerImpl seller = new SellerImpl();
        //below is the correct way to do this without violating anybody...
        seller.oldClass(); 
        
    }
            
}
