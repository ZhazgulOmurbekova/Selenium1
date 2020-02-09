package synchronization;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.DynamicLoading2Page;
import utilites.Driver;

public class ImplisitWaitTest {
    @Test
    public void threadSleep() throws InterruptedException{
        //1- getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");

        //2- Creating object to be able to reach Page class webElement

        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();

        //3- Clicking tio the Start button using the object we created
        dynamicLoading2Page.startButton.click();
       // Thread.sleep(6000);
        //4- Assert the webELement  is displayed on the [age
        Assert.assertTrue(dynamicLoading2Page.helloWordTest.isDisplayed(), "Text is not displayed");

    }
}
