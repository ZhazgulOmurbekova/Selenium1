package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.findElement(By.linkText("Store")).getText());
        String str = driver.findElement(By.linkText("Store")).getText();
        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedTitle = "Log in to ZeroBank";
        String actualTitle = driver.findElement(By.className("page-header")).getText();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("very good");
        }else{
            System.out.println("not really");
        }
        ;
    }
}
