package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectingFromNonSelecDropdowns {
    public static void main(String[] args) {
        //  TC #3: Selecting value from non-select dropdown
        //  1.Open Chrome browser
        //  2.Go to http://practice.cybertekschool.com/dropdown

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 3.Click to non-select dropdown
        WebElement dropdownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropdownLink.click();
        Select select = new Select(dropdownLink);
        select.selectByValue("dropdown-item");
        // 4.Select Facebook from dropdown
        // 5.Verify title is “Facebook - Log In or Sign Up”


    }
}
