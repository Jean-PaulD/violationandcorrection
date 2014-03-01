/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests.com.mycompany.violationandcorrection;

import com.mycompany.violationandcorrection.config.DomainConfig;
import com.mycompany.violationandcorrection.inheritance.service.Buyer;
import com.mycompany.violationandcorrection.inheritance.service.Impl.BuyerImpl;
import com.mycompany.violationandcorrection.inheritance.service.Impl.ItemImpl;
import com.mycompany.violationandcorrection.inheritance.service.Impl.SellerImpl;
import com.mycompany.violationandcorrection.inheritance.service.Impl.StudentImpl;
import com.mycompany.violationandcorrection.inheritance.service.Item;
import com.mycompany.violationandcorrection.inheritance.service.SellerService;
import com.mycompany.violationandcorrection.inheritance.service.StudentService;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    private static StudentService studentservice;
    private static Buyer buyer;
    private static SellerService sellerService;
    private static Item item;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(DomainConfig.class);
        
        studentservice = (StudentService) ctx.getBean("Student");
        buyer = (Buyer) ctx.getBean("Buyer");
        sellerService = (SellerService) ctx.getBean("Seller"); 
        item = (Item) ctx.getBean("Item");
        
    }

    @Test
    public static void buyerTest() throws Exception{
      Assert.assertNull("This should not be null", new BuyerImpl().itemName());
       //assertEquals(new BuyerImpl().)
      Assert.assertTrue( "This should be true", new BuyerImpl().cancelBid(true));
      
   }
    
   @Test
   public void studentTest() throws  Exception{
       Assert.assertNull("some null test", new StudentImpl().itemName("Some item"));
   }
   
   @Test
   public void itemTest()throws  Exception{
       Assert.assertEquals("seems legit", 100 , new ItemImpl().price());
   }
   
   @Test
   public void sellerTest()throws  Exception{
       Assert.assertEquals("a", 100 , new SellerImpl().bookprice());
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