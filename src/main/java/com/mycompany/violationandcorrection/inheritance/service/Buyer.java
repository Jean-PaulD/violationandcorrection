/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.inheritance.service;

/**
 *
 * @author Jean-Paul
 */
public interface Buyer extends StudentService {

    double makeBid(double bid);

    boolean cancelBid(boolean cancel);
}
