package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class ZaraSearch {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zara.com/us/");
       // driver.get("search");
        //driver.findElement(By.className("search-box")).sendKeys("pents");
        driver.findElement(By.xpath("//a[@class='_searchInput search-link']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("search-term")).click();
        driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("dress" + Keys.ENTER);


    }
}
