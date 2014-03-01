 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.violationandcorrection.config;

import com.mycompany.violationandcorrection.inheritance.service.Buyer;
import com.mycompany.violationandcorrection.inheritance.service.Impl.BuyerImpl;
import com.mycompany.violationandcorrection.inheritance.service.Impl.ItemImpl;
import com.mycompany.violationandcorrection.inheritance.service.Impl.SellerImpl;
import com.mycompany.violationandcorrection.inheritance.service.Impl.StudentImpl;
import com.mycompany.violationandcorrection.inheritance.service.Item;
import com.mycompany.violationandcorrection.inheritance.service.SellerService;
import com.mycompany.violationandcorrection.inheritance.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jean-Paul
 */
@Configuration
public class DomainConfig {
    @Bean (name = "Buyer")
    public Buyer getBuyer(){
       return new BuyerImpl();
    } 
    
    @Bean (name = "Item")
    public Item getItem(){
       return new ItemImpl();
    } 
    
    @Bean (name = "Seller")
    public SellerService getSeller(){
       return new SellerImpl();
    } 
    
    @Bean (name = "Student")
    public StudentService getSTudent(){
       return new StudentImpl();
    } 
    
    
    
    
}
