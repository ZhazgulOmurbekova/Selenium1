package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://www.noip.com/login");

        // 3.Enter username: username
    driver.findElement(By.name("username")).sendKeys("nurgazy1@gmail.com");
//        // 4.Enter password: password
       driver.findElement(By.name("password")).sendKeys("18425256dvr");
        // 5.Click sign in button
       driver.findElement(By.name("Login")).click();

       driver.findElement(By.name("name")).sendKeys("nurgazy12");

       driver.findElement(By.xpath("//span[@class='btn btn-flat btn-primary btn-panel-footer']")).click();
    }
}
