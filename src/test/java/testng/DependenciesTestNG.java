package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNG {

    @Test
    public void login(){
        System.out.println("logging in ...");
        Assert.fail("on purpose fail");
    }

    @Test(dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("Make purchase ...");

    }

    @Test
    public void homePage(){
        System.out.println("Home page is tested  ...");
    }



}
