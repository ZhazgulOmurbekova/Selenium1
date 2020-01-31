package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        // 1.Open Chrome browser
        // 2.Go to https://www.etsy.com
        // 3.Search for “wooden spoon”
        // 4.Verify title: Expected: “Wooden spoon | Etsy”
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        driver.findElement(By.name("search_query")).sendKeys("wooden spoon" + Keys.ENTER);


        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("good");
        }else{
            System.out.println("failed");
        }





    }
}
