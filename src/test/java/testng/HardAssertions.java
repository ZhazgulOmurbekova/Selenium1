package testng;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.ls.LSOutput;

import java.util.SortedMap;

public class HardAssertions {

    SoftAssert softAssert;

    @Test
    public void test1() {
        System.out.println("test one is starting");
        Assert.assertEquals(4, 5);

        System.out.println("test is on the middle");
        Assert.assertTrue(false);
        System.out.println("test one is ending");
    }


    @Test
    public void test2() {
        System.out.println("test two is starting");
    }


    @Test
    public void test3() {
        softAssert = new SoftAssert();
        System.out.println("test3 is starting ");

        softAssert.assertEquals(4, 5,"SOft is failing");

        Assert.assertTrue(false,"Hard is failing");
        System.out.println("test3 is on the middle ");

        softAssert.assertTrue(false);
        System.out.println("test3 is ending ");

    }

    @AfterMethod
    public void tearDown(){
        softAssert.assertAll();
    }


}
