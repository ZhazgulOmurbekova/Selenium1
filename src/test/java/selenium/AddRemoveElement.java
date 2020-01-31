package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElement {
    public static void main(String[] args) throws InterruptedException{
       // TC #2: PracticeCybertek.com_AddRemoveElementsWebElement verification
        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/add_remove_elements
        // 3.Click to “Add Element”button
        // 4.Verify “Delete”button is displayed after clicking.
        // 5.Click to “Delete”button.
        // 6.Verify “Delete”button is NOT displayed after clicking.USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
       WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(2000);
       addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if(deleteButton.isDisplayed()){
            System.out.println(deleteButton.getText() + " passed");
        }
        Thread.sleep(2000);
        deleteButton.click();

        if(!deleteButton.isDisplayed()){
            System.out.println(deleteButton.getText() + " passed");
        }







    }
}
