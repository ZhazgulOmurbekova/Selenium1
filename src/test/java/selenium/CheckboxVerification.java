package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckboxVerification {
    public static void main(String[] args) {
         // TC	#2:	SeleniumEasy	CheckboxVerification–Section	1
         // 1.Open	Chrome	browser
        //2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.
        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement success= driver.findElement(By.xpath("//div[@id='txtAge']"));

        if(!success.isDisplayed()){
            System.out.println("“Success–Check box is checked” message is NOT displayed passed");

        }
        else{
            System.out.println("failed");
        }
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkbox.click();

        if(success.isDisplayed()){
            System.out.println("“Success–Check box is checked” message is displayed");

        }
        else{
            System.out.println("failed");
        }





    }
}
