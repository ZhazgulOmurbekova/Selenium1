package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenGoogle {
    public static void main(String[] args) {
//        Open google.
//        Enter keyword “techlistic selenium tutorials”
//        It will show some options in dropdowns.
//        Get text of each option and match with “techlistic selenium tutorials”.
//        Select the option which matches.
//        After that, validate that Techlistic.com is the first option present.
//        Click on search result displayed for Techlistic.com.
//        Validate the page title.
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("techlistic");
        driver.findElement(By.xpath("//div[@class='sbtc']"));
        //driver.findElement(By.xpath(""))


    }
}
