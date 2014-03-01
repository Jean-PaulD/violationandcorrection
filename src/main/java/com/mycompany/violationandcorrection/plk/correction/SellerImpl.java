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
public class SellerImpl implements StudentService {

    NewClassService newClass;
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

    public String oldClass() {
            return "this class is new or old. I dont know";

        }
}
