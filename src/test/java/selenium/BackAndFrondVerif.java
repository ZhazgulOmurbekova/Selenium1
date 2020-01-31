package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndFrondVerif
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        String expectedGmail = "Gmail";
        String actualGmail = driver.getTitle();
        if(actualGmail.contains(expectedGmail)){
            System.out.println("Gmail Title Verification Passed");
        }else{
            System.out.println("Gmail Title Verification Failed");
        }
        driver.navigate().back();
        if(driver.getTitle().contains("Google")){
            System.out.println("Google Title Verification Passed");
        }else {
            System.out.println("Google Title Verification Failed");
        }
        driver.navigate().forward();
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail Title Verification Passed Again");
        }else{
            System.out.println("Gmail Title Verification Failed");
        }
    }
}
