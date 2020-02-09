package reviewOfUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class ReviewFile {
    public static void main(String[] args) throws Exception{
//        File file = new File("/User/cybertekchicago-1/NoteSunday.txt");
////        Scanner in = new Scanner(file);
////        while (in.hasNext()){
////        System.out.println(in.nextLine());}

        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("review.properties");
        properties.load(file);
        String str =  properties.getProperty("color");
        System.out.println(str);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));
        driver.findElement(By.name("q")).sendKeys(properties.getProperty("item") + Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
