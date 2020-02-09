package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
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
//
//                 6.Print out count of all the links on landing page
//                 we need to locate All of the links on the current page
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println("count of all the links on landing page " + links.size());

        //         7.Print out each link text on this page

        for (WebElement link : links) {
            System.out.println(link);

            System.err.println("link " + link.getText());
        }

    }
        public static void loginToSmartBear (WebDriver driver ){

//        Mini-Task:•Create a method called loginToSmartBear•
//        This method simply logs in to SmartBear when you callit.


            //         3.Enter username: “Tester”
            WebElement loginBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
            //         4.Enter password: “test”
            WebElement passwordBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
            //         5.Click to Login button
            WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));


            loginBox.sendKeys("Tester");
            passwordBox.sendKeys("test");
            loginButton.click();

        }


        public static void verifyOrder (WebDriver driver, String givenName){
//        PRACTICE	#4:	Method:	verifyOrder
//    •Create	a	method	named	verifyOrderthat	takes	WebDriver	object	and	String(name).
//    •This	method	should	verify	if	given	name
            List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
            for (WebElement name : allNames) {
                if (name.getText().equals(givenName)) {
                    System.out.println(givenName + " exist in the list. Verification Passed!");
                    return;
                }
            }
            System.out.println(givenName + " does Not exist int he list. Verification Failed!");

        }




        public static void 	printNamesAndCities(WebDriver driver){

//            Practice	#5:	Method:	printNamesAndCities
//            •Create	a	method	named	printNamesAndCitiesthat	takes	WebDriver	object
//            •This	method	should	simply	print	all	the	names	in	the list of all WebDriver



            List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
            List<WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));
            for (int i = 0; i < allCities.size(); i++) {
                System.out.println(allNames.get(i).getText() + "<== name \n" + allCities.get(i).getText() + " <== city");

            }




        }
    }
