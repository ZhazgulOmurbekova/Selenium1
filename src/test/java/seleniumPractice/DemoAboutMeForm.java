package seleniumPractice;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilites.SeleniumUtils;

public class DemoAboutMeForm {
    public static void main(String[] args) {
//        Open this link - https://www.techlistic.com/p/selenium-practice-form.html

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
//        Enter first and last name (textbox).

        Faker faker = new Faker();
        SeleniumUtils.pause(3);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        SeleniumUtils.pause(3);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
//        Select gender (radio button).
        SeleniumUtils.pause(3);
        driver.findElement(By.xpath("//input[@id='sex-1']")).click();
//        Select years of experience (radio button).
        driver.findElement(By.xpath("//input[@id='exp-4']")).click();
//        Enter date.
        SeleniumUtils.pause(3);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/01/2020");
//        Select Profession (Checkbox).
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
//        Select Automation tools you are familiar with (multiple checkboxes).
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        driver.findElement(By.xpath("//input[@id='tool-0']")).click();
//        Select Continent (Select box).
        WebElement continent = driver.findElement(By.xpath("//select[@id='continents']"));
        continent.click();
        Select selectAmerica = new Select(continent);
        selectAmerica.selectByIndex(5);
//       // Select multiple commands from a multi select box.
        WebElement multipleComandOption = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
        // multipleComandOption.click();
        Select multipleComands = new Select(multipleComandOption);
        multipleComands.selectByIndex(4);
////        If you can handle Upload image then try it or leave this step.

        SeleniumUtils.pause(2);
        WebElement photo = driver.findElement(By.xpath("//input[@id='photo']"));
        photo.click();

//        Click on Download file link and handle the download file pop-up (leave it if you are beginner).

        // driver.findElement(By.xpath("//a[@href='https://github.com/stanfy/behave-rest/blob/master/features/conf.yaml']")).click();
//        Click on Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();


    }
}
