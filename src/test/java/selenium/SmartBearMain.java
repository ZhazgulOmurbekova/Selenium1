package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearMain {
    public static void main(String[] args) {


//        TC	#1:	Smartbear	software	link	verification
//        1.Open	browser
//        2.Go	to	website:
//        http:secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

      loginToSmartBear(driver);

        //         6.Print out count of all the links on landing page
        //         we need to locate All of the links on the current page
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println("count of all the links on landing page " +links.size());

        //         7.Print out each link text on this page

        for (WebElement link: links){
            System.out.println(link);

            System.err.println("link "+link.getText());
        }

    }



    public static void loginToSmartBear(WebDriver driver ){

//        Mini-Task:•Create a method called loginToSmartBear•
//        This method simply logs in to SmartBear when you callit.


        //         3.Enter username: “Tester”
        WebElement loginBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        loginBox.sendKeys("Tester");

        //         4.Enter password: “test”
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwordBox.sendKeys("test");

        //         5.Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();

    }
}
