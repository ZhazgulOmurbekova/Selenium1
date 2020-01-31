package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppURLverification {
    public static void main(String[] args) {
        //TC #3: HerokuApp URL verification
        // 1.Open Chrome browser
        // 2.Go to https://the-internet.herokuapp.com/forgot_password
        // 3.Enter any email into input box
        // 4.Click on Retrieve password5.Verify URL contains: Expected: “email_sent”
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        driver.findElement(By.id("email")).sendKeys("kj@gmail.com");
        driver.findElement(By.id("form_submit")).click();

        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification passed!");
        }else{
            System.out.println("URL verification failed!");
        }


      String actualTextBoxValue =  driver.findElement(By.id("content")).getText();
        String expectedTextBoxValue = "Your e-mail's been sent!";

        if (actualTextBoxValue.equals(expectedTextBoxValue)){
            System.out.println("Text box value verification PASSED!");
        }else{
            System.out.println("Text box value verification FAILED!");
        }
    }
}
