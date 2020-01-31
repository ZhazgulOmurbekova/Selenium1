package selenium;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SmartbearOrderPlace {
    public static void main(String[] args)  throws InterruptedException{
//        TC#2: Smartbear software order placing
//        1.Open	browser
//        2.Go	to	website:
//        http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


//         3.Enter username: “Tester”
//         4.Enter password: “test”
//         5.Click on Login button
        SmartBearMain.loginToSmartBear(driver);


//         6.Click on Order
        WebElement orderClick = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderClick.click();


//         7.Select familyAlbum from product, set quantity to 2
        WebElement productCheckbox = driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select select = new Select(productCheckbox);
        select.selectByValue("FamilyAlbum");
        WebElement quantity = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
       // quantity.clear();


        Thread.sleep(2000);
        quantity.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        quantity.sendKeys("2");

//         8.Click to “Calculate”button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@type='submit']"));
        calculateButton.click();

//         9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        //command  + D to copy paste the line

        WebElement name = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));

        WebElement street = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));

        WebElement city = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));

        WebElement state = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));

        WebElement zip = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));

        Faker faker = new Faker();

        name.sendKeys(faker.name().firstName());
        street.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replaceAll("-",""));

//         10.Click on “visa” radio button
        WebElement visaButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visaButton.click();

//         11.Generate card number using JavaFaker
        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement exparDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        exparDate.sendKeys("10/25");

//         12.Click on “Process”
        WebElement processButton = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processButton.click();

        // 13.Verify success message “New order has been successfully added.”
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        if(successMessage.isDisplayed()){
            System.out.println("Message displayed. Order placed. PASS!");
        }else{
            System.out.println("Message is not displayed. Order NOT placed. FAIL!!!");
        }

    }
}
