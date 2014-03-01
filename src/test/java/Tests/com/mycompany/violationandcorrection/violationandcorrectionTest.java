/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests.com.mycompany.violationandcorrection;

import com.mycompany.violationandcorrection.config.DomainConfig;
import com.mycompany.violationandcorrection.inheritance.service.Buyer;
import com.mycompany.violationandcorrection.inheritance.service.Item;
import com.mycompany.violationandcorrection.inheritance.service.SellerService;
import com.mycompany.violationandcorrection.inheritance.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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

   // @Test
 //   public static void buyerImplTest() throws Exception{
  //      assertNull(new BuyerImpl().itemName(), "This should not be null");
  //      //assertEquals(new BuyerImpl().)
   //     assertTrue(new BuyerImpl().cancelBid(), "This should be true");
 //   }
    
    
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