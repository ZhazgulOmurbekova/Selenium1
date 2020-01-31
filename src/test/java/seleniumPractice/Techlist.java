package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilites.SeleniumUtils;

import javax.print.DocFlavor;
import java.util.concurrent.TimeUnit;

public class Techlist {
    public static void main(String[] args) {


//        1. Open this link  https://www.techlistic.com/

        WebDriverManager.chromedriver().setup();
        //        2. Launch Firefox browser. (You can choose browser of your choice).
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //        3. Maximize or set size of browser window.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/");
        SeleniumUtils.pause(2);
//        4. Click on 'Java Tutorial' link and validate page title.
        WebElement javaButton = driver.findElement(By.xpath("(//a[@href='https://www.techlistic.com/p/java.html'])[1]"));
        javaButton.click();
  SeleniumUtils.pause(2);
//        5. Navigate back to Home Page.
      WebElement homePage = driver.findElement(By.xpath("(//a[@href='https://www.techlistic.com/'])"));
      homePage.click();
 SeleniumUtils.pause(2);
//        6. Click on 'Selenium Tutorial' link and validate page title.
        WebElement seleniumTutorial =
                driver.findElement(By.xpath("(//a[@href='https://www.techlistic.com/p/selenium-tutorials.html'])[1]"));
      seleniumTutorial.click();
//        SeleniumUtils.pause(2);
////        7. Navigate back to Home Page.
//        homePage.click();
//        SeleniumUtils.pause(2);
////        8. Click on 'Selenium Blogs' link and validate page title.
//        seleniumTutorial.click();
//        SeleniumUtils.pause(2);
////        9. Navigate back to Home Page.
//        homePage.click();
       SeleniumUtils.pause(2);
////        10. Click on 'TestNG Blogs' link and validate page title.

        WebElement testingBlog = driver.findElement(By.xpath("(//a[@href='https://www.techlistic.com/p/testng.html'])[1]"));
        testingBlog.click();
        SeleniumUtils.pause(2);
//
//        11. Close the browser.
        driver.close();

    }
}
