/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests.com.mycompany.violationandcorrection;

import com.mycompany.violationandcorrection.encapsulation.Impl.BuyerImpl;
import com.mycompany.violationandcorrection.inheritance.service.Buyer;
import com.mycompany.violationandcorrection.encapsulation.Impl.StudentImpl;
import com.mycompany.violationandcorrection.inheritance.service.SellerService;
import com.mycompany.violationandcorrection.inheritance.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jean-Paul
 */
public class violationandcorrectionTest {

    public violationandcorrectionTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    private StudentService studentservice;
    private Buyer buyer;
    private SellerService sellerService;

    @BeforeClass
    public static void setUpClass() throws Exception {
        /*ApplicationContext ctx =
                new AnnotationConfigApplicationContext(violationandcorrection.class);
        studentservice = (StudentService) ctx.getBean("student");
        buyer = (Buyer) ctx.getBean("buyer");
        sellerService =  = (SellerService) ctx.getBean("seller"); */
    }

    @Test
    public static void buyerImplTest() throws Exception{
        assertNull(new BuyerImpl().itemName(), "This should not be null");
        //assertEquals(new BuyerImpl().)
        assertTrue(new BuyerImpl().cancelBid(), "This should be true");
    }
    
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}