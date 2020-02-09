package testng;

import com.google.gson.internal.bind.util.ISO8601Utils;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.*;
import org.w3c.dom.ls.LSOutput;

public class FirstTestNGClass {


  @BeforeClass
  public void setUp(){
      System.out.println("Before class is running ...");
  }

    @Test
    public void firstTest() {
        System.out.println("first test is running ...");

        Assert.assertEquals("ActualValue","expectedValue","First test is failed");
    }

    @Test
    public void secondTest() {
        System.out.println("second test is running ...");
        String letter = "b";

        Assert.assertTrue("sentence".contains(letter),"Sentence does not contain given letter !! " + letter);
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is running ...");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is running...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("AfterClass is running");
    }

}
