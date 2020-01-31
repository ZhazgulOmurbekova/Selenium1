package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

       String actualLink = driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
      String expectedInLink = "/forgot-password.html";


        if(expectedInLink.equals(actualLink)){
            System.out.println("Header verification PASSED");
        }else{
            System.out.println("Header verification failed");
        }
    }
}
