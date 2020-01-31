package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckboxVerificationEasy {
    public static void main(String[] args) {
        //        TC	#3:	SeleniumEasy	Checkbox	Verification	–Section	2
        //    1.Open	Chrome	browser
        //    2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify	“Check	All”	button	text	is	“Check	All”
        // 4.Click	to	“Check	All”	button
        // 5.Verify	all	check	boxes	are	checked
        // 6.Verify	button	text	changed	to	“UncheckAll"

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='check1']"));


        String expectedButton = "Check All";
        String actualButton = checkbox.getAttribute("value");


        if (expectedButton.equals(actualButton)) {
            System.out.println("Check All button text Passed");
        } else {
            System.out.println("Check All button text Failed");
        }

        checkbox.click();

        WebElement option1 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));//div[1]/div[2]/div[2]/div[2]/div[1]/label/input"));
        WebElement option2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));//"//div[1]/div[2]/div[2]/div[2]/div[2]/label/input"));
        WebElement option3 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));//"//div[1]/div[2]/div[2]/div[2]/div[3]/label/input"));
        WebElement option4 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));//"//div[1]/div[2]/div[2]/div[2]/div[4]/label/input"));


        if (option1.isSelected() && option2.isSelected() && option3.isSelected() && option4.isSelected()) {
            System.out.println("All checkboxes are checked. Verification Passed");
        } else {
            System.out.println("All checkboxes are unchecked. Verification Failed");
        }

        checkbox.click();


        String expectedButtonAfterClick = "Check All";
        String actualButtonAfterClick = checkbox.getAttribute("value");

        if (expectedButtonAfterClick.equals(actualButtonAfterClick)) {
            System.out.println("Check All button is unchecked  Passed");
        } else {
            System.out.println("Check All button is checked  Failed");
        }

    }
}
