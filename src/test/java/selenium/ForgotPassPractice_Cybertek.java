package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ForgotPassPractice_Cybertek {

        public static void main(String[] args) {
            //TC #1: PracticeCybertek.com_ForgotPasswordWebElement verification
            //1.Open Chrome browser
            //2.Go to http://practice.cybertekschool.com/forgot_password
            // 3.Locate all theWebElements on the page using XPATH locator only (total of
            //a.“Home”link
            //b.“Forgot password”header
            // c.“E-mail”text
            // d.E-mailinput box
            // e.“Retrieve password”button
            // f.“Powered by Cybertek School”text
            // 4.Verify allWebElements aredisplayed.


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://practice.cybertekschool.com/forgot_password");
            WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
            WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
            WebElement e_mailText = driver.findElement(By.xpath("//label[@for='email']"));
            WebElement e_mailInputBox = driver.findElement(By.xpath("//input[@name='email']"));
            WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));
            WebElement powered = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

            List<WebElement> wE = new ArrayList<WebElement>();
            wE.add(homeLink);
            wE.add(forgotPasswordHeader);
            wE.add(e_mailText);
            wE.add(e_mailInputBox);
            wE.add(retrievePassword);
            wE.add(powered);
            for (WebElement e : wE){
                if(e.isDisplayed()){
                    System.out.println(e.getText() + " passed");
                }else{
                    System.out.println("failed");
                }

            }


        }
    }

