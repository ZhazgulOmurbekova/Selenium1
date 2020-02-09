package actionsTest;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.amazonPages.AmazonLandingPage;
import utilites.Driver;

import javax.swing.*;

public class AmazonTests
{

    @Test
    public void signInLinkHoverTest(){


        //1-get the page first
        Driver.getDriver().get("https://amazon.com");
        //2- create the object of Page class to reach web elements
        AmazonLandingPage amazonLandingPage = new AmazonLandingPage();
        //3-create the object of Action class, and pass driver instance
        Actions actions = new Actions(Driver.getDriver());
        //into the constructor

        actions.moveToElement(amazonLandingPage.signInLink).perform();
        //4- we will move to link using actions instance and method




    }
}
