package synchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.DynamicLoading1Page;
import utilites.Driver;

public class ExplicitWaitTests {
    @Test
    public void waitForInputBoxTest(){
        //1-get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        //2- create the object to  use webElemnt

        DynamicLoading1Page dynamicLoading1Page = new DynamicLoading1Page();
        //3- click to start button
        dynamicLoading1Page.startButton.click();
        //4- we try to send keys
        //5 - we create the WebElement class object and pass driver and seconds
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));

        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");
    }
}
