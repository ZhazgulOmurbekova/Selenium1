package vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilites.VytrackUtilits;

public class CreateCalendarBtnTest {
    public static void main(String[] args) {
        WebDriver driver;
        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtilits.login(driver, "storemanager85","UserUser123");
        VytrackUtilits.navigateToModule(driver, "Activities","Calendar Events");

        if(driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).isDisplayed()) {
            System.out.println("Test 2 - Pass");
        } else {
            System.err.println("Test 2 - Fail");
        }


    }
}
