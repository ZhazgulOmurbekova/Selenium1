package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cybertekschool.com");
        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("passed url verification");
        }
        if(driver.getTitle().equals("Cybertek")){
            System.out.println("passed title");
        }
    }
}
